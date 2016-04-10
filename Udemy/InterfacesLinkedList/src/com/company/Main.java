package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<Albums> albumList = new ArrayList<Albums>();

    public static void main(String[] args) {
        Albums album = new Albums("VettaiKaran", "Vijay");
        album.addSongToAlbum("En Uchi Mandai", 4.25);
        album.addSongToAlbum("nan aducha", 4.25);
        album.addSongToAlbum("Vettakaran Tittle", 5.00);
        album.addSongToAlbum("oru chinna thamari", 3.45);
        album.addSongToAlbum("En Uchi Remix", 2.45);
        album.addSongToAlbum("Nan Aducha remix", 3.25);
        album.addSongToAlbum("ramba ramba", 3.25);
        albumList.add(album);

        album = new Albums("Sivalkasi", "Vijay");
        album.addSongToAlbum("Idhu enna", 3.25);
        album.addSongToAlbum("Deepavali", 4.55);
        album.addSongToAlbum("Vada Vada Vada Vada", 7.55);
        album.addSongToAlbum("Ada Ennaatha", 6.55);
        album.addSongToAlbum("Kodambakam Area", 3.55);
        albumList.add(album);

        List<Songs> playList = new LinkedList<Songs>();
        albumList.get(0).addtoPlaylist("En Uchi Mandai", playList);
        albumList.get(0).addtoPlaylist("Vettakaran Tittle", playList);
        albumList.get(0).addtoPlaylist("Nan Aducha remix", playList);
        albumList.get(0).addtoPlaylist("Kodambakam Area", playList);
        albumList.get(1).addtoPlaylist("Deepavali", playList);
        albumList.get(1).addtoPlaylist("Vada Vada Vada Vada", playList);
        albumList.get(1).addtoPlaylist("Kodambakam Area", playList);
        albumList.get(1).addtoPlaylist("Idhu enna", playList);

        play(playList);

    }

    private static void play(List<Songs> playlist) {
        for (Songs checkedSongs : playlist) {
            System.out.println("Song info in play list: " + checkedSongs.toString());
        }
    }
}
