package com.microservice.movieCatlog;

import com.microservice.movieCatlog.feignProxy.MovieDetailProxy;
import com.microservice.movieCatlog.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/detail")
public class MovieCatlogAPI {

    @Autowired MovieDetailProxy movieDetailProxy;

    @GetMapping("/{Id}")
    public Movie getRatedMovie(@PathVariable("Id") long id) {
        Movie  movie = movieDetailProxy.getMovieDetail(id);
        return movie;
    }

}
