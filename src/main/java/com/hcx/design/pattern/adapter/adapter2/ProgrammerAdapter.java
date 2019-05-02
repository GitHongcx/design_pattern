package com.hcx.design.pattern.adapter.adapter2;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class ProgrammerAdapter implements WorkAdapter {
    public String work(Object worker) {
        return ((Programmer)worker).program();
    }

    public boolean supports(Object worker) {
        return worker instanceof Programmer;
    }
}
