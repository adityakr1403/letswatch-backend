package com.adityakr1403.letswatchbackend.controller;

import com.adityakr1403.letswatchbackend.entity.Movie;
import com.adityakr1403.letswatchbackend.repository.MovieRepository;
import com.adityakr1403.letswatchbackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/get_all")
    public List<Movie> getMoviesList() {
        return movieService.getMovies();
    }

    @GetMapping("/get/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        Movie movie = movieService.getMovieById(id);
        return movie;
    }

    @PostMapping("/save")
    public Movie saveMovieDetails(@RequestBody Movie movie) {
        return movieService.saveMovieDetails(movie);
    }


}
