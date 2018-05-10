package com.example.android.musicapp;

public class Song {

    private int order;
    private String length;
    private String name;

    public Song(int order, String name, String length) {
        this.order = order;
        this.length = length;
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public String getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
