package com.craig.pe.ptbackendspring.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "route")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "history", nullable = false)
    private String history;

//    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
//    @ToString.Exclude
//    private Set<Image> image=new HashSet<>();

}