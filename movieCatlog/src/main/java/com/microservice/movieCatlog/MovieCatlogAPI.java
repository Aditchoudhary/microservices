package com.microservice.movieCatlog;

import com.microservice.movieCatlog.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/detail")
public class MovieCatlogAPI {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public Movie getRatedMovie(@PathVariable("userId") long userId) {
        Movie movie = restTemplate.getForObject("http://movie-info/movie/" + userId, Movie.class);
        return movie;
    }
}
