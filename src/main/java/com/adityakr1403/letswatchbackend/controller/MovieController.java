package com.adityakr1403.letswatchbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping("/trending")
    public String getTrendingMovies() {
        return "API working";
    }
}
