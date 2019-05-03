package com.hcx.design.pattern.adapter.classadapter;

/**
 * Created by hongcaixia on 2019/5/3.
 */
public class MyClass {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.sampleOperation1();//sampleOperation1
        adapter.sampleOperation2();//sampleOperation1
    }
}
