package com.example.listsongfromstorage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private List<Song> songList;
    private Context c;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView artist;
        public TextView uri;
        public TextView location;

        public ViewHolder(View iv) {
            super(iv);
            title = iv.findViewById(R.id.title);
            artist = iv.findViewById(R.id.artist);
            uri = iv.findViewById(R.id.uri);
            location = iv.findViewById(R.id.location);
        }
    }

    public SongListAdapter(Context c, List<Song> songs) {
        this.inflater = LayoutInflater.from(c);
        this.c=c;
        this.songList = songs;
    }


    @Override
    public SongListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.song_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongListAdapter.ViewHolder vh, int pos) {
        if(songList != null) {
            Song curSong = songList.get(pos);

            vh.title.setText(curSong.getTitle());
            vh.artist.setText(curSong.getArtist());
            vh.uri.setText(curSong.getUri());
            vh.location.setText(curSong.getLocation());
        } else {
            vh.title.setText(R.string.not_available);
            vh.artist.setText(R.string.not_available);
            vh.uri.setText(R.string.not_available);
            vh.location.setText(R.string.not_available);
        }
    }

    public void setSongList(List<Song> newSongList) {
        this.songList = newSongList;
    }

    @Override
    public int getItemCount() {
        return songList != null ? songList.size() : 0;
    }
}
