package com.gvs.util;

import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ApiUtil {

    private ApiUtil() {
    }

    @SneakyThrows
    public static String readJsonFromAFileAsGetAsAString(String path) {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    @SneakyThrows
    public static void writeJsonResponseIntoAFile(Response response, String path) {
        Files.write(Paths.get(path), response.asByteArray());
    }
}
