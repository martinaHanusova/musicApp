package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album> {


    public AlbumAdapter(@NonNull Context context, @NonNull List<Album> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_list_item, parent, false);
        }

        Album currentAlbum = getItem(position);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_image);
        iconView.setImageResource(currentAlbum.getImageId());

        TextView authorTextView = listItemView.findViewById(R.id.album_author);
        authorTextView.setText(String.valueOf(currentAlbum.getAuthor()));

        TextView nameTextView = listItemView.findViewById(R.id.album_name);
        nameTextView.setText(currentAlbum.getName());

        return listItemView;
    }
}
