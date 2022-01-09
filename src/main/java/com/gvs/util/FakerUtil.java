package com.gvs.util;

import com.github.javafaker.Faker;

public final class FakerUtil {

    private FakerUtil() {
    }

    static int getNumberBetween(int min, int max) {
        return new Faker().number().numberBetween(min, max);
    }

    static String getFirstName() {
        return new Faker().name().firstName();
    }

    static String getLastName() {
        return new Faker().name().lastName();
    }

    static String getEmail() {
        return new Faker().internet().emailAddress();
    }
}
