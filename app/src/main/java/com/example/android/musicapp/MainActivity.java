package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout firstAlbumLinearLayout = findViewById(R.id.firts_album);
        firstAlbumLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstAlbumIntent = new Intent(MainActivity.this, FirstAlbumActivity.class);
                startActivity(firstAlbumIntent);
            }
        });

        LinearLayout secondAlbumLinearLayout = findViewById(R.id.second_album);
        secondAlbumLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondAlbumIntent = new Intent(MainActivity.this, SecondAlbumActivity.class);
                startActivity(secondAlbumIntent);
            }
        });

        LinearLayout thirdAlbumLinearLayout = findViewById(R.id.third_album);
        thirdAlbumLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdAlbumIntent = new Intent(MainActivity.this, ThirdAlbumActivity.class);
                startActivity(thirdAlbumIntent);
            }
        });

        LinearLayout fourthAlbumLinearLayout = findViewById(R.id.fourth_album);
        fourthAlbumLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourthAlbumIntent = new Intent(MainActivity.this, FourthAlbumActivity.class);
                startActivity(fourthAlbumIntent);
            }
        });

        LinearLayout fifthAlbumLinearLayout = findViewById(R.id.fifth_album);
        fifthAlbumLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fifthAlbumIntent = new Intent(MainActivity.this, FifthAlbumActivity.class);
                startActivity(fifthAlbumIntent);
            }
        });
    }
}
