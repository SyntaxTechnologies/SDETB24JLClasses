package org.example.class13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        // location of the file
        String path="Files/Config.properties";
        // Reading the data from above file
        FileInputStream fis=new FileInputStream(path);

        Properties properties=new Properties();
        // converting 101010 to key value pairs
        properties.load(fis);
        // pulling the value of browser key from our file
        System.out.println(properties.get("browser"));




    }
}
