package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/20.
 */
public class PauseState extends VideoState{
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    public void pause() {
        System.out.println("暂停状态");
    }

    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
