package org.example.ResourceUnclosed;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ObjectStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("data.obj");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            HashMap<String, String> data = new HashMap<>();
            data.put("key", "value");
            objectOut.writeObject(data);
            // 忘记关闭 ObjectOutputStream 和 FileOutputStream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

