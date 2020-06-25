package com.socialnetwork.notes;

public class Image extends Media implements PrintableNote {

    protected String extantion;

    public boolean hasCompression() {
        return false;
    }

    @Override
    public void print() {
        System.out.println(getContentSize());
    }
}
