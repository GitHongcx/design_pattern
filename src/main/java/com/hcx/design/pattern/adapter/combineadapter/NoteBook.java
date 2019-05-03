package com.hcx.design.pattern.adapter.combineadapter;

/**
 * 笔记本：期望使用三相插座
 * Created by hongcaixia on 2019/5/3.
 */
public class NoteBook {

    private ThreePlugInterface threePlugInterface;

    public NoteBook(ThreePlugInterface threePlugInterface) {
        this.threePlugInterface = threePlugInterface;
    }

    /**
     * 使用插座充电
     */
    public void charge(){
        threePlugInterface.powerWithThree();
    }

    public static void main(String[] args) {
        GBTwoPlug twoPlug = new GBTwoPlug();
        //使用二相适配器（二相转三相）
        ThreePlugInterface threePlugInterface = new TwoPlugAdapter(twoPlug);
        //期望使用三相插座供电，但目前只有国标二相插座，通过适配器，把二相转为三相
        NoteBook noteBook = new NoteBook(threePlugInterface);
        noteBook.charge();
        /**
         * 通过转化
           使用二相电流供电
         */
        threePlugInterface = new TwoPlugAdapterExtends();
        noteBook = new NoteBook(threePlugInterface);
        noteBook.charge();
        /**
         * 借助继承适配器
           使用二相电流供电
         */
    }
}
