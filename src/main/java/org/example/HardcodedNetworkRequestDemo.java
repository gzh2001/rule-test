package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HardcodedNetworkRequestDemo {

    // 硬编码的URI
    private static final String EXAMPLE_URI = "http://1.1.1.1";

    public String makeRequest() {
        StringBuilder response = new StringBuilder();
        try {
            // 创建URL对象
            URL url = new URL(EXAMPLE_URI);

            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 设置请求方法为GET
            connection.setRequestMethod("GET");

            // 设置请求头
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // 获取响应码
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // 如果响应码是200（HTTP_OK），读取响应内容
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // 关闭输入流
                in.close();
            } else {
                System.out.println("GET request failed.");
            }

            // 断开连接
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}
