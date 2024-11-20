package org.example.random;

import java.security.SecureRandom;

public class SecureRandomWithSeedExample {
    byte[] seed = "my-custom-seed".getBytes();
    SecureRandom sr = new SecureRandom(seed);

    int v = sr.nextInt(32);
}
