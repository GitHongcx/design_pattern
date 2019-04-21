package com.hcx.design.pattern.decorator;

/**
 * Created by HCX on 2019/4/21.
 */
public class LoggingRunnable implements Runnable{

    private final Runnable innerRunnable;

    public LoggingRunnable(Runnable innerRunnable) {
        this.innerRunnable = innerRunnable;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("Task started at"+startTime);

        innerRunnable.run();

        System.out.println("Task finished. Elapsed time:"+(System.currentTimeMillis()-startTime));
    }


}
