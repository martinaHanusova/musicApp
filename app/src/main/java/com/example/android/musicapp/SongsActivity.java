package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    AlbumRepository albumRepository = AlbumRepository.getInstance();
    String albumId;
    String nowPlayingSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        final TextView textViewNowPlaying = findViewById(R.id.view_now_playing);
        Bundle b = getIntent().getExtras();
        if (b != null) {
            albumId = b.getString("albumId");
            nowPlayingSong = b.getString("nowPlayingSong");
        }
        SongAdapter songAdapter = new SongAdapter(this, albumRepository.findOne(albumId).getSongs());
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        textViewNowPlaying.setText(nowPlayingSong);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String song = albumRepository.findOne(albumId).getSongs().get(i).getName();
                MainActivity.setNowPlayingSong(song);
                textViewNowPlaying.setText(song);
            }
        });
    }
}
