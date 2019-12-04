package com.microservice.movieInfo.model;

public class Movie {
    private long movieId;
    private String name;
    private String portno;

    public Movie() {

    }

    public String getPortno() {
        return portno;
    }

    public void setPortno(String portno) {
        this.portno = portno;
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
