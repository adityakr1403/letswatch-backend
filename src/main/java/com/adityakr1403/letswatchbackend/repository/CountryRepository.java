package com.adityakr1403.letswatchbackend.repository;

import com.adityakr1403.letswatchbackend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
