package com.adityakr1403.letswatchbackend.entity;

import com.adityakr1403.letswatchbackend.entity.compositeKeys.MovieCrewKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieCrew {
    @EmbeddedId
    private MovieCrewKey id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn()
    private Movie movie;

    @ManyToOne
    @MapsId("personId")
    @JoinColumn()
    private Person person;


    @ManyToOne
    @MapsId("departmentId")
    @JoinColumn
    private Department department;

    private String job;
}
