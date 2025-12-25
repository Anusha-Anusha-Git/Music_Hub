package Model;

import java.util.*;

public class MusicLibrary {

    private static final ArrayList<Music> musicList = new ArrayList<>();

    private static final Stack<Music> recentStack = new Stack<>();

    private static final Queue<Music> playQueue = new LinkedList<>();
    
    private static final Queue<Music> exploreQueue = new LinkedList<>();
    
    private static ArrayList<Music> userLibrary = new ArrayList<>();
    public static boolean addMusic(Music music) {
        for (Music m : musicList) {
            if (m.getTitle().equalsIgnoreCase(music.getTitle()) &&
                m.getArtist().equalsIgnoreCase(music.getArtist())) {
                // Duplicate found
                return false;
            }
        }
        musicList.add(music);
        return true;
    }
    
    public static void deleteMusic(int id) {
        musicList.removeIf(m -> m.getId() == id);
    }
    
    static {
        musicList.add(new Music(1, "Honey", "Taylor Swift", "The Life of a Showgirl", "Pop", 2025));
        musicList.add(new Music(2, "Intro", "Ariana Grande", "Eternal Sunshine", "Pop", 2024));
        musicList.add(new Music(3, "Perfect", "Ed Sheeran", "Divide", "Romance", 2017));
        musicList.add(new Music(4, "Believer", "Imagine Dragons", "Evolve", "Rock", 2018));
        musicList.add(new Music(5, "Tears", "Sabrina Carpenter", "Mom's Best Friend", "Pop", 2025));
    }
    
    public static boolean isDuplicate(String title, String artist) {
    for (Music m : musicList) {
        if (m.getTitle().equalsIgnoreCase(title) && m.getArtist().equalsIgnoreCase(artist)) {
            return true;
        }
    }
    return false;
}
    public static void updateMusic(int id, Music updatedMusic) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.set(i, updatedMusic);
                break;
            }
        }
    }
    
    public static ArrayList<Music> getAllMusic() {
        return musicList;
    }

    public static void sortByTitle() {
        Collections.sort(musicList, new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                return m1.getTitle().compareToIgnoreCase(m2.getTitle());
            }
        });
    }

    // Sort by year
    public static void sortByYear() {
        Collections.sort(musicList, new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                return m1.getYear() - m2.getYear();
            }
        });
    }


    public static Music getMusicByTitle(String title) {
        int low = 0;
        int high = musicList.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Music midSong = musicList.get(mid);

            int result = midSong.getTitle().compareToIgnoreCase(title);

            if (result == 0)
                return midSong;
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
    
     public static void addToRecent(Music music) {
        recentStack.push(music);
    }
     
    public static Music getLastPlayed() {
        return recentStack.isEmpty() ? null : recentStack.peek();
    }

    public static void addToQueue(Music music) {
        playQueue.offer(music); // FIFO
    }

    public static Music playNext() {
        return playQueue.poll();
    }

    public static void addToExploreQueue(Music music) {
        exploreQueue.offer(music);
    }

    public static Queue<Music> getExploreQueue() {
        return exploreQueue;
    }

    // Songs to show in Explore page
    public static ArrayList<Music> getExploreSongs() {
        return new ArrayList<>(musicList); // reuse library songs
    }
    
    private void refreshSongTable() {
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) songTable.getModel();
    model.setRowCount(0); // clear table

    for (Music m : MusicLibrary.getAllMusic()) {
        Object[] row = {m.getId(), m.getTitle(), m.getArtist(), m.getAlbum(), m.getGenre(), m.getYear()};
        model.addRow(row);
    }
}
    public static ArrayList<Music> getUserLibrary() {
    return userLibrary;
}
    public static void addMusicToUserLibrary(Music m) {
        if (!userLibrary.contains(m)) {
            userLibrary.add(m);
        }
    }
}
