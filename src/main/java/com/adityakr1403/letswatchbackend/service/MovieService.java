package com.adityakr1403.letswatchbackend.service;


import com.adityakr1403.letswatchbackend.entity.Movie;
import com.adityakr1403.letswatchbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Movie saveMovieDetails(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).get();
    }
}
