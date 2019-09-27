package com.microservice.movieCatlog.model;

public class Movie {
    private long movieId;
    private String name;

    public Movie() {

    }

    public long getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
