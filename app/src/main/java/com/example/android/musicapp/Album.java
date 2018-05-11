package com.example.android.musicapp;

import java.util.ArrayList;


public class Album {
    private String id;
    private int imageId;
    private String name;
    private String author;
    private ArrayList<Song> songs;

    public Album(String name, String author, ArrayList<Song> songs, String id, int imageId) {
        this.name = name;
        this.author = author;
        this.songs = songs;
        this.id = id;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
