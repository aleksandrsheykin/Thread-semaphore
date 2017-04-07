package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class Kvadrator extends Thread {
    private int K = 0;
    public int Result = 0;
    Thread thread;

    public Kvadrator(int k) {
        K = k;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Result = K*K;
            MySemaphore.b = Result;
            if (MySemaphore.getResolution()) {
                Consumer.met(0, Result, 0);
            }
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
