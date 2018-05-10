package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FourthAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Young Girls", "3:49"));
        songs.add(new Song(2, "Locked Out Of Heaven", "3:54"));
        songs.add(new Song(3, "Gorilla [Clean]", "4:05"));
        songs.add(new Song(4, "Treasure [Clean]", "2:56"));
        songs.add(new Song(5, "Moonshine", "3:49"));
        songs.add(new Song(6, "When I Was Your Man", "3:34"));
        songs.add(new Song(7, "Natalie", "3:45"));
        songs.add(new Song(8, "Show Me", "3:28"));
        songs.add(new Song(9, "Money Make Her Smile", "3:24"));
        songs.add(new Song(10, "If I Knew", "2:13"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
