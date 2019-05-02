package com.hcx.design.pattern.adapter.adapter1;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {

    public static void main(String[] args) {
        Cooker cooker = new CookerImpl();
        Programmer programmer = new ProgrammerImpl();
        Object[] workers = {cooker,programmer};

        WorkAdapter workadapter = new WorkAdapterImpl();

        for(Object worker : workers){
            String workContent = workadapter.work(worker);
            System.out.println(workContent);
        }


    }
}
