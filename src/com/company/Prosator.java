package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class Prosator extends Thread {
    private int K = 0;
    public int Result = 0;
    Thread thread;

    public Prosator(int k) {
        K = k;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Result = K;
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
