package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by arun on 4/9/16.
 */
public class Albums {

    private String albumName;
    private String artistName;
    private SongList songlistClass;

    public Albums(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songlistClass = new SongList();
    }

    public boolean addSongToAlbum(String tittle, double duration){
        if (songlistClass.addSongToSongList(tittle,duration)){
            return true;
        } else {
            return false;
        }
    }

    private Songs findSongInAlbum(String tittle){
        return songlistClass.findSongInSongList(tittle);
    }

    public boolean removeSongFromAlbum(String tittle){
        return songlistClass.removeSongFromSongsList(tittle);
    }

    public String getAlbumName() {
        return albumName;
    }

    public void printSongInAlbum(){
        songlistClass.printSongInSongList();
    }

    public boolean addtoPlaylist(int trackNumber, LinkedList<Songs> playlist){
        int index = trackNumber-1;
        if ((index>0)&&(index<=this.songlistClass.songsListArray.size())){
            playlist.add(this.songlistClass.songsListArray.get(index));
            return true;
        }
        System.out.println("This Album does not have a track");
        return false;
    }

    public boolean addtoPlaylist(String tittle, LinkedList<Songs> playlist){
        Songs checkedSong = findSongInAlbum(tittle);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " +tittle+ " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Songs> songsListArray;

        private SongList() {
            this.songsListArray = new ArrayList<Songs>();
        }
        private boolean addSongToSongList(String tittle, double duration){
            if(findSongInSongList(tittle) == null) {
                songsListArray.add(new Songs(tittle, duration));
                return true;
            } else {
                return false;
            }
        }

        private boolean removeSongFromSongsList (String tittle){
            for(int i=0;i<this.songsListArray.size();i++){
                if(this.songsListArray.get(i).getTittle().equals(tittle)){
                    System.out.println("Removed the tittle track named: " +tittle);
                    this.songsListArray.remove(i);
                    return true;
                }
            }
            System.out.println("Song tittled "+tittle+" is not present in the album");
            return false;
        }

        private Songs findSongInSongList(String tittle){
            for (Songs checkedSong : this.songsListArray){
                if(checkedSong.getTittle().equals(tittle)){
                    return checkedSong;
                }
            }
            return null;
        }

        private void printSongInSongList(){
            for(Songs checkedSongs : this.songsListArray){
                System.out.println("Song Info: "+ checkedSongs.toString());
            }
        }

    }


}
