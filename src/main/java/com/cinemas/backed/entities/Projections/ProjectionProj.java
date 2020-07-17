package com.cinemas.backed.entities.Projections;

import com.cinemas.backed.entities.Film;
import com.cinemas.backed.entities.Salle;
import com.cinemas.backed.entities.Seance;
import com.cinemas.backed.entities.Ticket;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(types = {com.cinemas.backed.entities.Projection.class}, name = "p1")
public interface ProjectionProj {
    public Long getId();
    public Date getDateProjection();
    public double getPrix();
    public Salle getSalle();
    public Film getFilm();
    public Collection<Ticket> getTickets();
    public Seance getSeance();
}
