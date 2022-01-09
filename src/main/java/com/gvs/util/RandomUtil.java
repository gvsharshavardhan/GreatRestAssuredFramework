package com.gvs.util;

public final class RandomUtil {

    private RandomUtil() {
    }

    public static int getId() {
        return FakerUtil.getNumberBetween(900, 1200);
    }

    public static String getFirstName() {
        return FakerUtil.getFirstName();
    }

    public static String getLastName() {
        return FakerUtil.getLastName();
    }

    public static String getEmailId(){
        return FakerUtil.getEmail();
    }

}
