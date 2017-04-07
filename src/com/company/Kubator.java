package com.company;

/**
 * Created by admin on 07.04.2017.
 */
public class Kubator extends Thread {
    private int K = 0;
    public int Result = 0;
    Thread thread;

    public Kubator(int k) {
        K = k;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized(this) {
            try {
                Result = K * K * K;
                MySemaphore.a = Result;
                boolean fl = true;
                while(fl) {
                    if (MySemaphore.getResolution()) {
                        Consumer.met(Result, 0, 0);
                        fl = false;
                        //sleep(10);
                    }
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
