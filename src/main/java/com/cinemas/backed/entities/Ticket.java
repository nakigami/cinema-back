package com.cinemas.backed.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ticket implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique = false, nullable = true)
    private Integer codePayment;
    private boolean reservee;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
