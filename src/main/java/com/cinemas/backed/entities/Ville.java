package com.cinemas.backed.entities;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ville implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double longitude,latitude,altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;
}
