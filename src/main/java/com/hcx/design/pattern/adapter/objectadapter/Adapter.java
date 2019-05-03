package com.hcx.design.pattern.adapter.objectadapter;

/**
 * Created by hongcaixia on 2019/5/3.
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1() {
        //直接使用adaptee中的sampleOperation1方法
        adaptee.sampleOperation1();
    }

    public void sampleOperation2() {
        //自己编写
        System.out.println("sampleOperation2");
    }

}
