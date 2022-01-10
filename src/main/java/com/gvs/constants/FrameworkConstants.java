package com.gvs.constants;

import lombok.Getter;


public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static @Getter final String requestJsonFolderPath = System.getProperty("user.dir")+"/src/test/resources/jsons/";
    private static @Getter final String responseJsonFolderPath = System.getProperty("user.dir")+"/target/";
}
