package com.example.listsongfromstorage;

public class Song {
    private long id;
    private String title;
    private String artist;
    private String uri;
    private String location;

    public Song(long id, String title, String artist, String uri, String location) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.uri = uri;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUri() {
        return uri;
    }

    public String getLocation() {
        return location;
    }
}
