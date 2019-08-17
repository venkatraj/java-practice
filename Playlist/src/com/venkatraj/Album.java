package com.venkatraj;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, long duration) {
        Song existingSong = findSong(title);
        if (existingSong == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song: this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, Playlist playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.size()) {
            playlist.addSong(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, Playlist playlist) {
        Song song = findSong(songTitle);
        if (song != null) {
            playlist.addSong(song);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }
}
