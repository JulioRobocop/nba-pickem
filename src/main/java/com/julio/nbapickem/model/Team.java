package com.julio.nbapickem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long externalId;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "abbreviation", unique = true, nullable = false, length = 3)
    private String abbreviation;

    @Enumerated(EnumType.STRING)
    @Column(name = "conference", nullable = false)
    private Conference conference;

    @Enumerated(EnumType.STRING)
    @Column(name = "division", nullable = false)
    private Division division;

    @Column(name = "image_url")
    private String imageUrl;
}
