package com.gvs.constants;

import lombok.Getter;

@Getter
public class FrameworkConstantsSingleton {

    private FrameworkConstantsSingleton() {
    }

    private static FrameworkConstantsSingleton INSTANCE = null;

    public static synchronized FrameworkConstantsSingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new FrameworkConstantsSingleton();

        }
        return INSTANCE;
    }

    private final String requestJsonFolderPath = System.getProperty("user.dir") + "/src/test/resources/jsons/";
    private final String responseJsonFolderPath = System.getProperty("user.dir") + "/target/";
    private final String propertiesFilePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
}
