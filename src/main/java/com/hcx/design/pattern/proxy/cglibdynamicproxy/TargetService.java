package com.hcx.design.pattern.proxy.cglibdynamicproxy;

/**
 * 目标类
 * Created by hongcaixia on 2019/5/2.
 */
public class TargetService {

    public String doFirst(){
        System.out.println("执行doFist()方法");
        return "abc";
    }

    public void doSecond(){
        System.out.println("执行doSecond()方法");
    }
}
