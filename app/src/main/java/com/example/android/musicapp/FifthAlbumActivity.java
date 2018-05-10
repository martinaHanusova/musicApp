package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FifthAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "M! Ssundaztood", "3:37"));
        songs.add(new Song(2, "Don't Let Me Get Me", "3:31"));
        songs.add(new Song(3, "Just Like a Pill [Explicit]", "3:57"));
        songs.add(new Song(4, "Get the Party Started", "3:12"));
        songs.add(new Song(5, "Respect", "3:25"));
        songs.add(new Song(6, "18 Wheeler", "3:44"));
        songs.add(new Song(7, "Family Portrait", "4:56"));
        songs.add(new Song(8, "Misery", "4:32"));
        songs.add(new Song(9, "Dear Diary", "3:29"));
        songs.add(new Song(10, "Eventdally", "3:35"));
        songs.add(new Song(11, "Lonely Girl", "4:20"));
        songs.add(new Song(12, "Numb", "3:08"));
        songs.add(new Song(13, "Gone to California", "4:34"));
        songs.add(new Song(14, "My Vietnam", "5:19"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
