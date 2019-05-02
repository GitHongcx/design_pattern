package com.hcx.design.pattern.proxy.cglibdynamicproxy;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {
    public static void main(String[] args) {
        TargetService proxyService = new MyCglibFactory(new TargetService()).myCglibFactory();
        String result = proxyService.doFirst();
        System.out.println("result="+result);
        proxyService.doSecond();
        /**
         * 执行doFist()方法
           result=ABC
           执行doSecond()方法
         */
    }
}
