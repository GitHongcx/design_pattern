package com.hcx.design.pattern.decorator;

/**
 * Created by HCX on 2019/4/21.
 */
public class Mytest {

    public static void main(String[] args) {
        new LoggingRunnable(new TransactionalRunnable(new CodingTask())).run();
    }
}
