package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class MySemaphore {
    static int a, b, c = 0;

    public static boolean getResolution() {
        if (a==0 || b==0 || c==0) {
            System.out.println("getResolution a="+a+" b="+b+" c="+c);
            return false;
        }
        return true;
    }
}
