package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Chandelier", "3:36"));
        songs.add(new Song(2, "Big Girls Cry", "3:31"));
        songs.add(new Song(3, "Burn the Pages", "3:15"));
        songs.add(new Song(4, "Eye of the Needle", "4:09"));
        songs.add(new Song(5, "Hostage", "2:56"));
        songs.add(new Song(6, "Straight for the Knife", "3:31"));
        songs.add(new Song(7, "Fair Game", "3:52"));
        songs.add(new Song(8, "Elastic Heart", "4:17"));
        songs.add(new Song(9, "Free the Animal", "4:25"));
        songs.add(new Song(10, "Fire Meet Gasoline", "4:02"));
        songs.add(new Song(11, "Cellophane", "4:26"));
        songs.add(new Song(12, "Dressed In Black", "6:40"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
