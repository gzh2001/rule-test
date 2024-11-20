package org.example.ResourceUnclosed;

import java.io.FileReader;
import java.io.BufferedReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            // 忘记关闭文件流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

