package com.hcx.design.pattern.proxy.staticproxy;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {

    public static void main(String[] args) {
//        TargetService targetService = new TargetServiceImpl();
        TargetService targetService = new ProxyServiceImpl(new TargetServiceImpl());
        //写完上面这句话，我突然一愣：这特喵不是装饰模式吗？？？！！！
        String result = targetService.doFirst();
        System.out.println("result是："+result);
        targetService.doSecond();
        /**
         *  执行doFirst()
            result是：abc
            执行doSecond()方法
         */
        /**
         * 增强之后：
         * 执行doFirst()
           result是：ABC
           执行doSecond()方法
         */
    }
}
