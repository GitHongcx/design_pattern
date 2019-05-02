package com.hcx.design.pattern.adapter.adapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongcaixia on 2019/5/2.
 */
public class MyTest {

    private static List<WorkAdapter> allAdapters;

    public static void main(String[] args) {
        Cooker cooker = new CookerImpl();
        Programmer programmer = new ProgrammerImpl();
        Object[] workers = {cooker,programmer};


        for(Object worker : workers){
            WorkAdapter adapter = getAdapter(worker);
            String work = adapter.work(worker);
            System.out.println(work);
            /**
             * 制作香喷喷的饭菜
               编写高效程序
             */
        }

    }

    /**
     * 根据worker获取相应的适配器对象
     * @param worker
     * @return
     */
    private static WorkAdapter getAdapter(Object worker) {
        List<WorkAdapter> workAdapters = getAllAdapters();
        for (WorkAdapter adapter : workAdapters) {
            if (adapter.supports(worker)) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * 获取所有的适配器
     * @return
     */
    public static List<WorkAdapter> getAllAdapters() {
        List<WorkAdapter> adapters = new ArrayList<WorkAdapter>();
        adapters.add(new CookerAdapter());
        adapters.add(new ProgrammerAdapter());
        return adapters;
    }
}
