package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/20.
 */
public class StopState extends VideoState{
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("ERROR:停止状态不能快进");
    }

    public void pause() {
        System.out.println("ERROR:停止状态不能暂停");
    }

    public void stop() {
        System.out.println("状态");
    }
}
