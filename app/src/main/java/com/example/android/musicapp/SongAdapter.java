package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView orderTextView = listItemView.findViewById(R.id.order_text_view);
        orderTextView.setText(String.valueOf(currentSong.getOrder()));

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentSong.getName());

        TextView lengthTextView = listItemView.findViewById(R.id.length_text_view);
        lengthTextView.setText(currentSong.getLength());

        return listItemView;
    }
}
