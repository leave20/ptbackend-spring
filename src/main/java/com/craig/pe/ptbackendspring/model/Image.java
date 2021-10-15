package com.craig.pe.ptbackendspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String Url;

    private String idImage;

    private String description;

    public Image(String name, String url, String idImage, String description) {
        this.name = name;
        Url = url;
        this.idImage = idImage;
        this.description=description;
    }

//    @ManyToOne(optional = false)
//    private Route route;
}
