package com.adityakr1403.letswatchbackend.entity.compositeKeys;

import jakarta.persistence.Column;
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
public class MovieCrewKey implements Serializable {

    private Long personId;
    private Long movieId;
    private Long departmentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieCrewKey that)) return false;
        return Objects.equals(getPersonId(), that.getPersonId()) && Objects.equals(getMovieId(), that.getMovieId()) && Objects.equals(getDepartmentId(), that.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getMovieId(), getDepartmentId());
    }
}
