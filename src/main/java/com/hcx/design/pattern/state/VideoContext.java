package com.hcx.design.pattern.state;

/**
 * Created by HCX on 2019/4/20.
 */
public class VideoContext {

    //组合课程视频状态
    private VideoState videoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void play(){
        this.videoState.play();
    }

    public void speed(){
        this.videoState.speed();
    }

    public void stop(){
        this.videoState.stop();
    }

    public void pause(){
        this.videoState.pause();
    }
}
