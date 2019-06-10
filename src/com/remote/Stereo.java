package com.remote;

public class Stereo {

    int volume;

    public void on() {
        System.out.println("Stereo On !!!");
    }

    public void off() {
        System.out.println("Stereo Off !!!");
    }

    public void setCD() {
        System.out.println("Stereo CD !!!");
    }

    public void setDVD() {
        System.out.println("Stereo DVD !!!");
    }

    public void setRadio() {
        System.out.println("Stereo Radio !!!");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo Volume: " + this.volume + "\n" );
    }
}
