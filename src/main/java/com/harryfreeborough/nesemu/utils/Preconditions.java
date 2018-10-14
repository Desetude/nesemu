package com.harryfreeborough.nesemu.utils;

/**
 * TODO: Desetude
 */
public class Preconditions {
    
    private Preconditions() {}
    
    public static void checkState(boolean check, String format, Object... args) {
        if (!check) {
            throw new IllegalStateException(String.format(format, args));
        }
    }
    
    public static void checkNotNull(Object obj, String format, Object... args) {
        if (obj == null) {
            throw new NullPointerException(String.format(format, args));
        }
    }
    
}