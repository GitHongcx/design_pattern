package com.hcx.design.pattern.adapter.adapter2;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public interface WorkAdapter {

    String work(Object worker);
    boolean supports(Object worker);

}
