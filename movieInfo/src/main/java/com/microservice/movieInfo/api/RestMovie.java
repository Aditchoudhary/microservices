package com.microservice.movieInfo.api;

import com.microservice.movieInfo.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class RestMovie {

   @GetMapping(path="/{id}")
    public Movie getMovie(@PathVariable("id") long id){

        Movie movie = new Movie();
        movie.setMovieId(12);
        movie.setName("gadar");

        return  movie;
    }

}
