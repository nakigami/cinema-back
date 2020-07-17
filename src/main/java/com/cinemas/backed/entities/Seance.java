package com.cinemas.backed.entities;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Seance implements Serializable{
    @Id @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIME)
    private Date heureDebut;
}
