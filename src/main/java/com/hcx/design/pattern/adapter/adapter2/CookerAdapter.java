package com.hcx.design.pattern.adapter.adapter2;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class CookerAdapter implements WorkAdapter{
    public String work(Object worker) {
        return ((Cooker)worker).cook();
    }

    public boolean supports(Object worker) {
        return worker instanceof Cooker;
    }
}
