package com.spring.springlab2;

import java.util.ArrayList;
import java.util.List;

public class TelevisionProgram {
    private String name;
    private String genre;
    private final List<Show> shows = new ArrayList<>();

    public TelevisionProgram(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }
}