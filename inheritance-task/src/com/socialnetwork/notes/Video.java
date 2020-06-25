package com.socialnetwork.notes;

public class Video extends Media implements PlayableNote {

    private int duration;

    public void playLoop() {
        play();
    }

    @Override
    public void play() {
        System.out.println("Started playing");
    }
}
