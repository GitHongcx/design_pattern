package com.hcx.design.pattern.adapter.combineadapter;

/**
 * 二相转三相的插座适配器
 */
public class TwoPlugAdapter implements ThreePlugInterface {

    private GBTwoPlug twoPlug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }

    public void powerWithThree() {
        System.out.println("通过转化");
        twoPlug.powerWithTwo();
    }
}
