package com.cinemas.backed.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Place implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private double longitude,latitude,altitude;
    private int numero;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Salle salle;
    @OneToMany(mappedBy = "place")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Ticket> tickets;
}
