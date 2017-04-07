package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class MySemaphore {
    private int a, b, c = 0;
    public boolean getResolution() {
        if (a!=0 && b!=0 && c!=0) {
            return true;
        }
        return false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
