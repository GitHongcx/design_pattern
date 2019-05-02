package com.hcx.design.pattern.adapter.adapter1;

/**
 * 适配器类
 * Created by hongcaixia on 2019/5/2.
 */
public class WorkAdapterImpl implements WorkAdapter{

    public String work(Object worker) {

        String workContent = "";

        //若对象是厨师，则调用cook()方法
        if(worker instanceof Cooker){
            workContent = ((Cooker) worker).cook();
        }else if(worker instanceof Programmer){
            workContent = ((Programmer) worker).program();
        }
        return workContent;
    }
}
