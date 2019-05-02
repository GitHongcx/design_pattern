package com.hcx.design.pattern.proxy.cglibdynamicproxy2;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {
    public static void main(String[] args) {
        TargetService proxyService = new MyCglibFactory(new TargetServiceImpl()).myCglibFactory();
        String result = proxyService.doFirst();
        System.out.println("reuslt="+result);
        proxyService.doSecond();
        /**
         * 执行doFirst()
           reuslt=ABC
           执行doSecond()方法
         */
    }
}
