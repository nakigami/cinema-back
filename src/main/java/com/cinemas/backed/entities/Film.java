package com.cinemas.backed.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Film implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private String titre;
    private String desciption;
    private String realisateur;
    private Date dateSortie;
    private double duree;
    private String photo;
    @OneToMany(mappedBy = "film")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Projection> projections;
    @ManyToOne
    private Categorie categorie;
}
