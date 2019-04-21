package com.hcx.design.pattern.decorator;

/**
 * Created by HCX on 2019/4/21.
 */
public class CodingTask implements Runnable{

    public void run() {
        System.out.println("coding");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
