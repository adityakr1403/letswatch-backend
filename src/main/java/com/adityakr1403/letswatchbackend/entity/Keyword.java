package com.adityakr1403.letswatchbackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Keyword {
    @Id
    @SequenceGenerator(
            name = "keyword_sequence",
            sequenceName = "keyword_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "keyword_sequence"
    )
    private Long keywordId;
    private String keywordName;
}
