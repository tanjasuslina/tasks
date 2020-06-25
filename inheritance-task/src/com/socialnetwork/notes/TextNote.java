package com.socialnetwork.notes;

public class TextNote extends AbstractNote implements PrintableNote {

    protected boolean isRichFormatted;

    @Override
    int getMaxSize() {
        return 1;
    }

    public String trim() {
        return message != null ? message.trim() : null;
    }

    @Override
    public void print() {
        if (message != null) {
            System.out.println(message);
        }
    }
}

