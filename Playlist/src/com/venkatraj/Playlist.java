package com.venkatraj;

import java.util.LinkedList;

public class Playlist {
    private String name;
    public LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
