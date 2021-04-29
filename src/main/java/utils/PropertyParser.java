package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyParser {
    private Properties properties;
    private InputStream input;

    public PropertyParser(String propertiesPath) {
        properties = new Properties();
        input = null;
        try {
            input = new FileInputStream(propertiesPath);
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public int getIntProperty(String propertyName) {
        return Integer.parseInt(properties.getProperty(propertyName));
    }
}
