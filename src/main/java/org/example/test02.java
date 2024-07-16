package org.example;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

public class test02 {
    public static void main(String[] args) {
        // 硬编码的路径分隔符示例
        String path1 = "C:\\path\\to\\file.txt";
        String path2 = "/home/user/file.txt";
        String parentPath = "/mnt";
        Properties prop = new Properties();


        // 无关的代码
        String greeting = "Hello, world!";
        int number = 42;
        try{
            // 硬编码的 URI 示例
            prop.load(new FileInputStream("uri.properties"));
            URI uri2 = new URI("https://example.com/path?query=1");
            URI uri3 = new URI(prop.getProperty("web1"));

            // 硬编码的 IP 地址 URI 示例
            URI ipUri = new URI("http://192.168.1.1");
            URI ipUriOnly = new URI("192.168.1.1");
            URI ipUriOnlyWithPort = new URI("192.168.1.1:9000");
            URI ipUriOnlyWithPortPath = new URI("192.168.1.1:9000/webapp?username=admin");
            // 硬编码的文件路径示例
            File file1 = new File("C:/path/to/file.txt");
            File file2 = new File("/home/user/file.txt");
            File file3 = new File("/home/user", "file.txt");
            File file4 = new File(parentPath, "file.txt"); // parentPath 是任意类型的对象
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}
