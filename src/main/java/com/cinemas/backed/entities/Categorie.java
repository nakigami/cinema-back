package com.cinemas.backed.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "categorie")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Film> films;
}
