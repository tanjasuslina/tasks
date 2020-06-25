package com.socialnetwork.notes;

public class Media extends AbstractNote {

    protected byte[] content;

    public int getContentSize() {
        return content.length;
    }

    @Override
    int getMaxSize() {
        return 32;
    }
}



