package com.hcx.design.pattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {
    public static void main(String[] args) {
        final TargetService targetService = new TargetServiceImpl();

        /**
         * newProxyInstance:获取对应目标类的代理对象.
         * ClassLoader loader:目标类的类加载器
         * Class<?>[] interfaces:目标类所实现的所有接口
         * InvocationHandle h:InvocationHandler的实例
         */
        TargetService proxyService = (TargetService) Proxy.newProxyInstance(
                targetService.getClass().getClassLoader(),
                targetService.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * invoke:调用对应的目标类的方法.
                     * @param proxy 代理对象
                     * @param method 目标方法
                     * @param args 目标方法参数列表
                     * @return
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //调用目标方法
                        Object result = method.invoke(targetService, args);
                        if(result!=null){
                            result = ((String)result).toUpperCase();
                        }
                        return result;
                    }
                }
        );

        String result = proxyService.doFirst();
        System.out.println("result="+result);
        proxyService.doSecond();
        /**
         *  执行doFirst()
            result=ABC
            执行doSecond()方法
         */
    }
}
