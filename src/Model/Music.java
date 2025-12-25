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
    private String title;
    private String artist;
    private String genre;
    private int year;
    private int duration;

    public Music(String title, String artist, String genre, int year, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    // Getters and Setters
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

    public String getGenre() { 
        return genre; 
    }
    
    public void setGenre(String genre) { 
        this.genre = genre; 
    }

    public int getYear() { 
        return year; 
    }
    
    public void setYear(int year) { 
        this.year = year; 
    }

    public int getDuration() { 
        return duration; 
    }
    
    public void setDuration(int duration) { 
        this.duration = duration; 
    }
}
