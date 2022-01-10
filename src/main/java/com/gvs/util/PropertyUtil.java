package com.gvs.util;

import com.gvs.constants.FrameworkConstantsSingleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//read the content only once from properties file and store it in a java collections
public final class PropertyUtil {
    private PropertyUtil() {
    }

    private static Properties properties = new Properties();
    private static Map<String, String> map = new HashMap();

    static {
        try (FileInputStream fileInputStream =
                     new FileInputStream(FrameworkConstantsSingleton.getINSTANCE().getPropertiesFilePath())) { //closeable
            properties.load(fileInputStream);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(0);
        }
        properties.entrySet().forEach(e -> map.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())));
    }

    public static String getValue(String key) {
        return map.get(key);
    }
}