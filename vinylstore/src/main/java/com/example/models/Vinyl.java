package com.example.models;

public class Vinyl {
    private String id;
    private String title;
    private String[] artists;
    private String[] genres;
    private String releaseDate;
    private int stock;
    private double price;
    private String[] trackList;
    private String coverArt;

    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public String[] getArtists() {
        return artists;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String[] getTrackList() {
        return trackList;
    }

    public String getCoverArt() {
        return coverArt;
    }

}
