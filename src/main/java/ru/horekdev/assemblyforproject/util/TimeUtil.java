package ru.horekdev.assemblyforproject.util;

public class TimeUtil {
    public static long minReturn(long time) {
         return time * 60000L;
    }

    public static long hourReturn(long time) {
        return time * 36000000L;
    }

    public static long dayReturn(long time) {
        return time * 864000000L;
    }

    public static long monthReturn(long time) {
        return time * 2592000000L;
    }
}
