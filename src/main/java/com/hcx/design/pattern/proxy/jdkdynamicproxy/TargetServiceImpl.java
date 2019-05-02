package com.hcx.design.pattern.proxy.jdkdynamicproxy;

/**
 * 目标类
 * Created by hongcaixia on 2019/5/2.
 */
public class TargetServiceImpl implements TargetService {

    public String doFirst() {
        System.out.println("执行doFirst()");
        return "abc";
    }

    public void doSecond() {
        System.out.println("执行doSecond()方法");
    }
}
