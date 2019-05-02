package com.hcx.design.pattern.proxy.cglibdynamicproxy2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyCglibFactory implements MethodInterceptor {

    private TargetService targetService;

    public MyCglibFactory(TargetService targetService) {
        this.targetService = targetService;
    }

    public TargetService myCglibFactory(){

        //创建增强器对象
        Enhancer enhancer = new Enhancer();
        //指定目标类，即父类
        enhancer.setSuperclass(TargetService.class);
        //设置回调接口对象(一个类实现了Callback接口，那么该类的对象就是回调对象)
        /**
         * 当前类实现了MethodInterceptor接口，而MethodInterceptor又继承了CallBack,
         * 所以当前类实现了Callback接口，所以当前类就是一个回调对象
         */
        enhancer.setCallback(this);
        //返回代理对象
        return (TargetService) enhancer.create();
    }

    /**
     * 回调方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //调用目标方法
        Object result = method.invoke(targetService, objects);
        if(result!=null){
            result = ((String) result).toUpperCase();
        }
        return result;
    }
}
