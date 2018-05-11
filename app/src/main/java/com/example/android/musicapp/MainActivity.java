package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlbumRepository albumRepository = new AlbumRepository();
    private static String nowPlayingSong = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final AlbumAdapter albumAdapter = new AlbumAdapter(this, albumRepository.findAll());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                Bundle b = new Bundle();
                b.putString("albumId", albumRepository.findAll().get(i).getId());
                b.putString("nowPlayingSong", getNowPlayingSong());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        TextView textViewNowPlaying = findViewById(R.id.view_now_playing);
        textViewNowPlaying.setText(getNowPlayingSong());
    }

    public static String getNowPlayingSong() {
        return nowPlayingSong;
    }

    public static void setNowPlayingSong(String nowPlayingSong) {
        MainActivity.nowPlayingSong = nowPlayingSong;
    }
}
