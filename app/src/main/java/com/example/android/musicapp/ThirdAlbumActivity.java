package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ThirdAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Welcome To New York", "3:32"));
        songs.add(new Song(2, "Blank Space", "3:51"));
        songs.add(new Song(3, "Style", "3:51"));
        songs.add(new Song(4, "Out of the Woods", "3:55"));
        songs.add(new Song(5, "All You Had To Do Was Stay", "3:13"));
        songs.add(new Song(6, "Shake It Off", "3:39"));
        songs.add(new Song(7, "I Wish You Would", "3:27"));
        songs.add(new Song(8, "Bad Blood", "3:31"));
        songs.add(new Song(9, "Wildest Dreams", "3:40"));
        songs.add(new Song(10, "How You Get The Girl", "4:07"));
        songs.add(new Song(11, "This Love", "4:10"));
        songs.add(new Song(12, "I Know Places", "3:15"));
        songs.add(new Song(12, "Clean", "4:31"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
