package com.adityakr1403.letswatchbackend.entity.compositeKeys;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieCastKey implements Serializable {
    private Long movieId;
    private Long genderId;
    private Long personId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieCastKey that)) return false;
        return Objects.equals(getMovieId(), that.getMovieId()) && Objects.equals(getGenderId(), that.getGenderId()) && Objects.equals(getPersonId(), that.getPersonId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovieId(), getGenderId(), getPersonId());
    }
}
