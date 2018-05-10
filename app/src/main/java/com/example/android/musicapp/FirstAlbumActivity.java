package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Eraser", "3:47"));
        songs.add(new Song(2, "Castle on the Hill", "4:21"));
        songs.add(new Song(3, "Dive", "3:58"));
        songs.add(new Song(4, "Shape of You", "3:54"));
        songs.add(new Song(5, "Perfect", "4:23"));
        songs.add(new Song(6, "Galway Girl", "2:48"));
        songs.add(new Song(7, "Happier", "3:28"));
        songs.add(new Song(8, "New Man", "3:09"));
        songs.add(new Song(9, "Hearts Don't Break Around Here", "4:08"));
        songs.add(new Song(10, "What Do I Know?", "3:57"));
        songs.add(new Song(11, "How Would You Feel", "4:41"));
        songs.add(new Song(12, "Supermarket Flowers", "3:41"));
        songs.add(new Song(13, "Barcelona", "3:11"));
        songs.add(new Song(14, "Bibia Be Ye Ye", "2:57"));
        songs.add(new Song(15, "Nancy Mulligan", "3:00"));
        songs.add(new Song(16, "Save Myself", "4:07"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}
