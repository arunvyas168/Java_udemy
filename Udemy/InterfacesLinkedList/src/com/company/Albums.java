package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by arun on 4/9/16.
 */
public class Albums {

    private String albumName;
    private String artistName;
    ArrayList<Songs> songlist = new ArrayList<Songs>();

    public Albums(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songlist = new ArrayList<Songs>();
    }

    public boolean addSongToAlbum(String tittle, double duration){
        if(findSongInAlbum(tittle) == null){
            this.songlist.add(new Songs(tittle,duration));
            return true;
        }
        return false;
    }

    private Songs findSongInAlbum(String tittle){
        for (Songs checkedSong : this.songlist){
            if(checkedSong.getTittle().equals(tittle)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean removeSongFromAlbum(String tittle){
        for(int i=0;i<this.songlist.size();i++){
            if(this.songlist.get(i).getTittle().equals(tittle)){
                System.out.println("Removed the tittle track named: " +tittle);
                this.songlist.remove(i);
                return true;
            }
        }
        System.out.println("Song tittled "+tittle+" is not present in the album");
        return false;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void printSongInAlbum(){
        for(Songs checkedSongs : this.songlist){
            System.out.println("Song Info: "+ checkedSongs.toString());
        }
    }

    public boolean addtoPlaylist(int trackNumber, List<Songs> playlist){
        int index = trackNumber-1;
        if ((index>0)&&(index<=this.songlist.size())){
            playlist.add(this.songlist.get(index));
            return true;
        }
        System.out.println("This Album does not have a track");
        return false;
    }

    public boolean addtoPlaylist(String tittle, List<Songs> playlist){
        Songs checkedSong = findSongInAlbum(tittle);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " +tittle+ " is not in this album");
        return false;
    }


}
