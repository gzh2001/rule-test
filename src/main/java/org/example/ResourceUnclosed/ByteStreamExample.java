package org.example.ResourceUnclosed;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("source.txt");
            FileOutputStream outputStream = new FileOutputStream("destination.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            // 忘记关闭输入和输出流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

