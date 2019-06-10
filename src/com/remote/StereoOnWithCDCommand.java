package com.remote;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo = new Stereo();

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }
}
