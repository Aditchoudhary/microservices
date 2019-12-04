package com.microservice.movieCatlog.feignProxy;

import com.microservice.movieCatlog.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul-gateway")
public interface MovieDetailProxy {

    @GetMapping("/movie-info/movie/{id}") Movie getMovieDetail(
            @PathVariable("id") long id);
}
