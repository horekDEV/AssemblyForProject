package ru.horekdev.assemblyforproject.util;

import java.util.Date;

public class TimeUtil {
    public static Date minReturn(long time) {
         long l = time * 60000L;
         return new Date(l);
    }

    public static Date hourReturn(long time) {
        long l = time * 36000000L;
        return new Date(l);
    }

    public static Date dayReturn(long time) {
        long l = time * 864000000L;
        return new Date(l);
    }

    public static Date monthReturn(long time) {
        long l = time * 2592000000L;
        return new Date(l);
    }
}
