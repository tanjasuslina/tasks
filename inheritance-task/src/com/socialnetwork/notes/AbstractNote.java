package com.socialnetwork.notes;

import java.util.Date;

abstract class AbstractNote {
    protected String author;
    protected Date date;
    protected String message;
    protected MessageType messageType;

    void displayContent() {
        String toString = "Note{" +
                "author='" + author + '\'' +
                ", date=" + date +
                ", message='" + message + '\'' +
                ", messageType=" + messageType +
                '}';

        System.out.println(toString);
    }

    abstract int getMaxSize();
}

