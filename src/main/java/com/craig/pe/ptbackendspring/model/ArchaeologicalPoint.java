package com.craig.pe.ptbackendspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "archaeological_point")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArchaeologicalPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;

    private String direction;

}
