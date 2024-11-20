package org.example.S5445;

import java.io.File;
import java.io.IOException;

public class InsecureTemporaryFileCreate {
    File tempDir;
    tempDir = File.createTempFile("", ".");
    tempDir.delete();
    tempDir.mkdir();  // Noncompliant
}
