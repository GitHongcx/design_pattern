package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/20.
 */
public class PlayState extends VideoState{
    public void play() {
        System.out.println("播放状态");
    }

    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
