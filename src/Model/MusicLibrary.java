/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author Anusha
 */
public class MusicLibrary {
     private ArrayList<Music> musicList;
     public MusicLibrary() {
        musicList = new ArrayList<>();
    }

    // Add new music
    public void addMusic(Music music) {
        musicList.add(music);
    }

    // Update music by ID
    public void updateMusic(int id, Music updatedMusic) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.set(i, updatedMusic);
                return;
            }
        }
    }

    // Delete music by ID
    public void deleteMusic(int id) {
        musicList.removeIf(m -> m.getId() == id);
    }

    // Get all music
    public ArrayList<Music> getAllMusic() {
        return musicList;
    }
    public void sortByTitle() {
        musicList.sort((m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()));
    }

    // Optional: Sort by year
    public void sortByYear() {
        musicList.sort((m1, m2) -> Integer.compare(m1.getYear(), m2.getYear()));
    }
}
