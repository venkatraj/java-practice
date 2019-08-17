package com.venkatraj;

import java.util.*;

public class Main {
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<Album>();

	    albums.add(new Album("NKP"));
	    albums.get(0).addSong("NKP Song 1", 300);
        albums.get(0).addSong("NKP Song 2", 250);
        albums.get(0).addSong("NKP Song 3", 250);
        albums.get(0).addSong("NKP Song 4", 250);
        albums.get(0).addSong("NKP Song 5", 250);


	    albums.add(new Album("Komali"));
	    albums.get(1).addSong("Komali Song One", 225);
        albums.get(1).addSong("Komali Song Two", 325);
        albums.get(1).addSong("Komali Song Three", 325);
        albums.get(1).addSong("Komali Song Four", 325);
        albums.get(1).addSong("Komali Song Five", 325);

        Playlist playlist = new Playlist("Popular Songs");
        albums.get(0).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);

        albums.get(0).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist("no such song", playlist);

        run(playlist);
    }

    private static void run(Playlist playlist) {
        ListIterator songs = playlist.songs.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goForward = true;
        printMenu();
        while(! quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!goForward) {
                            songs.next();
                        }
                        goForward = true;
                    if (songs.hasNext()) {
                        System.out.println("Now playing: " + songs.next().toString());
                    } else {
                        System.out.println("Reached end of list");
                        goForward = false;
                    }
                    break;
                case 2:
                    if (goForward) {
                        songs.previous();
                    }
                    goForward = false;
                    if (songs.hasPrevious()) {
                        System.out.println("Now playing: " + songs.previous().toString());
                    } else {
                        System.out.println("Reached start of list");
                        goForward = true;
                    }
                    break;
                case 3:
                    if (goForward) {
                        System.out.println("Now playing: " + songs.previous());
                        goForward = false;
                    } else {
                        System.out.println("Now playing: " + songs.next());
                        goForward = true;
                    }
                    break;
                case 4:
                    if (playlist.songs.size() > 0) {
                        songs.remove();
                        if (songs.hasNext()) {
                            System.out.println("Now playing: " + songs.next().toString());
                        } else if (songs.hasPrevious()) {
                            System.out.println("Now playing: " + songs.previous().toString());
                        } else {
                            System.out.println("No songs in the list");
                        }
                    }
                    break;
                case 5:
                    listSongs(playlist);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Enter your choice: ");
        System.out.println("0 - Quit");
        System.out.println("1 - Play next track");
        System.out.println("2 - Play previous track");
        System.out.println("3 - Replay current track");
        System.out.println("4 - Remove current track");
        System.out.println("5 - List songs");
        System.out.println("6 - Print menu");
    }

    private static void listSongs(Playlist playlist) {
        Iterator songs = playlist.songs.iterator();
        if (playlist.songs.size() > 0) {
            while (songs.hasNext()) {
                System.out.println(songs.next().toString());
            }
        } else {
            System.out.println("No songs in playlist");
        }

    }
}
