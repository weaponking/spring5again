package com.spring5.prop;

import java.util.UUID;

public final class Utils {

    public static String getPwd() {
        return UUID.randomUUID().toString();
    }
}
