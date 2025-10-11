package org.example.class14;

import org.example.utils.ConfigReader;

import java.io.IOException;

public class E8ConfigReader {
    public static void main(String[] args) throws IOException {

       String value= ConfigReader.readProperty("url");
        System.out.println(value);
    }
}
