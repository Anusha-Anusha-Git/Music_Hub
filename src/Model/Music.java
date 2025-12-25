/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Anusha
 */
public class Music {
    private int id;
    private String title;
    private String artist;
    private String album;
    private String genre;
    private int year;

    public Music(int id, String title, String artist, String album, String genre, int year) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
    }

    // Getters and Setters
     public int getId() { 
         return id; 
     }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getTitle() { 
        return title; 
    }
    public void setTitle(String title) { 
        this.title = title; 
    }

    public String getArtist() { 
        return artist; 
    }
    public void setArtist(String artist) { 
        this.artist = artist; 
    }

    public String getAlbum() { 
        return album; 
    }
    public void setAlbum(String album) { 
        this.album = album; 
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { 
        this.genre = genre; 
    }

    public int getYear() { 
        return year; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }
            
}
