package com.cyberrtek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        // This is path to the location of the file
        String path = "configuration.properties";

        try {
            // java can't read the file directly, it need to inputStream to read
            //inputStream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //Properties class is use to read specifically properties file,
            // file with key value pairs
            properties = new Properties();

            // file contents are load to properties from the inputStream
            properties.load(fileInputStream);

            // all input streams must be closed
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // returns the value of specific property
    public static String getProperty(String property){

        return properties.getProperty(property);
    }
}
