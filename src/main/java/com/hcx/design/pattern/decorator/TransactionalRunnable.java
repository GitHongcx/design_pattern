package com.hcx.design.pattern.decorator;

/**
 * Created by HCX on 2019/4/21.
 */
public class TransactionalRunnable implements Runnable{

    private final Runnable innerRunnable;

    public TransactionalRunnable(Runnable innerRunnable) {
        this.innerRunnable = innerRunnable;
    }

    public void run(){
        boolean rollback = false;
        try{
            beginTransaction();
            innerRunnable.run();
        }catch (Exception e){
            rollback = true;
            throw new RuntimeException(e);
        }finally {
            if(rollback){
                rollback();
            }else {
                commit();
            }
        }
    }

    private void commit(){
        System.out.println("commit");
    }

    private void rollback(){
        System.out.println("rollback");
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }





}
