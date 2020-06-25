package com.socialnetwork.notes;

public class Audio extends Media implements PlayableNote {

    private int volume;

    public void changeVolume(int percent) {
        volume = Math.max(volume + percent, 100);
    }

    @Override
    public void play() {
        System.out.println("Started playing");
    }
}
