package com.adityakr1403.letswatchbackend.repository;

import com.adityakr1403.letswatchbackend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
