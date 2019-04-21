package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/21.
 */
public class MyTest {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();

        videoContext.setVideoState(new PlayState());
        System.out.println("当前状态："+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.pause();
        System.out.println("当前状态："+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.speed();
        System.out.println("当前状态："+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.stop();
        System.out.println("当前状态："+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.speed();
    }
}
