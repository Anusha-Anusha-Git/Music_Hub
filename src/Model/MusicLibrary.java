/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Anusha
 */
public class MusicLibrary {
    private ArrayList<Music> songList;
    private Queue<Music> recentSongs;

    public boolean addSong(Music song) {
        // Check duplicate title
        for (Music s : songList) {
            if (s.getTitle().equalsIgnoreCase(song.getTitle())) {
                return false; // duplicate title
            }
        }
        songList.add(song);

        // add to recently added queue (max 5)
        recentSongs.add(song);
        if (recentSongs.size() > 5) {
            recentSongs.poll();
        }

        return true;
    }

    public ArrayList<Music> getAllSongs() {
        return songList;
    }
    
    public void updateSong(int index, Music updatedSong) {
        songList.set(index, updatedSong);
    }
    
     public void deleteSong(int index) {
        songList.remove(index);
    }
     
    public Queue<Music> getRecentSongs() {
        return recentSongs;
    }
}
