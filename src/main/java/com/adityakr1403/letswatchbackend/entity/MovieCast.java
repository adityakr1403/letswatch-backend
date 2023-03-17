package com.adityakr1403.letswatchbackend.entity;

import com.adityakr1403.letswatchbackend.entity.compositeKeys.MovieCastKey;
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
public class MovieCast {

    @EmbeddedId
    private MovieCastKey id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn()
    private Movie movie;

    @ManyToOne
    @MapsId("personId")
    @JoinColumn()
    private Person person;

    @ManyToOne
    @MapsId("genderId")
    @JoinColumn
    private Gender gender;

    private String characterName;
    private String castOrder;
}
