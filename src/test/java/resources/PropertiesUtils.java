package resources;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {
    Properties prop = new Properties();


    public PropertiesUtils() {
        try {
            FileInputStream file = new FileInputStream("src/test/java/resources/global.properties");
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public String getUrl(){
        return prop.getProperty("base_url");
    }
    }
