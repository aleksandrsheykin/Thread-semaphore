package com.company;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by admin on 07.04.2017.
 */
public class Consumer {
    static AtomicBoolean kubatorLock = new AtomicBoolean(true);
    static AtomicBoolean kvadratorLock = new AtomicBoolean(true);
    static AtomicBoolean prostatorLock = new AtomicBoolean(true);

    public static void met(int a, int b, int c, String threadName) {

        if(a != 0){
            while (!kubatorLock.get())
                Thread.yield();
            kubatorLock.set(false);
        }

        if(b != 0) {
            while (!kvadratorLock.get()) {
                Thread.yield();
            }
            kvadratorLock.set(false);
        }

        if(c != 0) {
            while (!prostatorLock.get()) {
                Thread.yield();
            }
            prostatorLock.set(false);
        }

        if(a != 0)
            kubatorLock.set(true);
        if(b != 0)
            kvadratorLock.set(true);
        if(c != 0)
            prostatorLock.set(true);

        System.out.println(a+b+c + " | a="+a+" b="+b+" c="+c+" threadName="+threadName);
    }
}
