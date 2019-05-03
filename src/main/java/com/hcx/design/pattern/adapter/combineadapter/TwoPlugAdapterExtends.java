package com.hcx.design.pattern.adapter.combineadapter;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugInterface{

    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();

    }
}
