package org.example.resource;

import cn.com.git.uc.sync.model.RequestResult;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;


class Test {
 public static RequestResult post(String uri, int timeout, String data, String encoding) {
        OutputStream os = null;
        PrintStream ps = null;
        InputStream is = null;
        BufferedInputStream bis = null;
        ByteArrayOutputStream bos = null;
        RequestResult result = new RequestResult();
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Cache-Control", "no-cache");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            os = connection.getOutputStream();
            ps = new PrintStream(os);
            ps.write(data.getBytes(encoding));
            ps.flush();
            is = connection.getInputStream();
            bis = new BufferedInputStream(is);
            bos = new ByteArrayOutputStream();
            int len;
            byte[] buffer = new byte[2048];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
                bos.flush();
            }
            result.setState(SyncState.SUCCESS);
            result.setData(bos.toString());
        } catch (ConnectException | SocketTimeoutException ex) {
            result.setState(SyncState.TIMEOUT);
            result.setEx(ex);
        } catch (Exception ex) {
            result.setState(SyncState.FAILED);
            result.setEx(ex);
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (is != null) {
                    is.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException ex) {
                // 释放资源引发异常，不设置状态
            }
        }
        return result;
    }

    public static void copyFIle(String oldPath, String newPath) {
		InputStream insStream = null;
		FileOutputStream fs = null;
		try {
			int bytesum = 0;
			int byteread = 0;
			File oldFile = new File(oldPath);
			if (oldFile.exists()) {
				insStream = new FileInputStream(oldFile);
				fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[1444];
				while ((byteread = insStream.read(buffer)) != -1) {
					bytesum += byteread;
					fs.write(buffer, 0, byteread);
				}
				insStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (insStream != null) {
					insStream.close();
				}
				if (fs != null) {
					fs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
