package org.example.ResourceUnclosed;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("This is a test line.");
            // 忘记关闭文件流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
