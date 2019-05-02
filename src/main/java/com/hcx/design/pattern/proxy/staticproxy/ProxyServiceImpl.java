package com.hcx.design.pattern.proxy.staticproxy;

/**
 * 代理类
 * Created by hongcaixia on 2019/5/2.
 */
public class ProxyServiceImpl implements TargetService{

    private TargetService targetService;

    public ProxyServiceImpl(TargetService targetService) {
        this.targetService = targetService;
    }

    public String doFirst() {
        String result = targetService.doFirst();
        return result.toUpperCase();
    }

    public void doSecond() {
        targetService.doSecond();
    }
}
