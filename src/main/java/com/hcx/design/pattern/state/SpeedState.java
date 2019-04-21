package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/20.
 */
public class SpeedState extends VideoState{
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("快进状态");
    }

    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
