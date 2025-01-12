package model;

import java.util.List;

public class Movie {

    private String title;
    private List<String> genres;
    private String director;
    private double rating;


    // Creates a new movie
    public Movie(String title, List<String> genres, String director, double rating) {
        this.title = title;
        this.genres = genres;
        this.director = director;
        this.rating = rating;

    }

    // Getters

    public String getTitle(){
        return title;
    }

    public List<String> getGenres(){
        return genres;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }



}
