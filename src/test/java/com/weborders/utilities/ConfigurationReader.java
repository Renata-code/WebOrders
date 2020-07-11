package com.weborders.utilities;

import javafx.css.CssMetaData;
import javafx.css.Styleable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("configuration.properties")) {

             properties = new Properties();
            properties.load(fileInputStream);
            //fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(("Unable to find configuration.properties!"));
        }
    }

    public static String getProperty(String key){

        return  properties.getProperty(key);

    }

}
