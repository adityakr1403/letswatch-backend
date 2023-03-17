package com.adityakr1403.letswatchbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Long movieId;
    private String title;
    private String trailerUrl;
    private String posterUrl;
    @Column(
            columnDefinition = "TEXT"
    )
    private String overview;
    private Float imdbRating;
    private Float runtime;
    private String budget;
    private String revenue;
    private Date releaseDate;
    private Long likes;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "production_country",
            joinColumns = @JoinColumn(
                    name = "movie_id",
                    referencedColumnName = "movieId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "country_id",
                    referencedColumnName = "countryId"
            )
    )
    private List<Country> countries;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "movie_languages",
            joinColumns = @JoinColumn(
                    name = "movie_id",
                    referencedColumnName = "movieId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "language_id",
                    referencedColumnName = "languageId"
            )
    )
    private List<Language> languages;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "movie_genre",
            joinColumns = @JoinColumn(
                    name = "movie_id",
                    referencedColumnName = "movieId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "genre_id",
                    referencedColumnName = "genreId"
            )
    )
    private List<Genre> genres;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "movie_keywords",
            joinColumns = @JoinColumn(
                    name = "movie_id",
                    referencedColumnName = "movieId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "keyword_id",
                    referencedColumnName = "keywordId"
            )
    )
    private List<Keyword> keywords;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "movie_company",
            joinColumns = @JoinColumn(
                    name = "movie_id",
                    referencedColumnName = "movieId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "company_id",
                    referencedColumnName = "companyId"
            )
    )
    private List<ProductionCompany> companies;

}
