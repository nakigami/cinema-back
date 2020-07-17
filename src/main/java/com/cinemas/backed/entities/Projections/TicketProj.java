package com.cinemas.backed.entities.Projections;

import com.cinemas.backed.entities.Place;
import com.cinemas.backed.entities.Ticket;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "TicketProj",types = Ticket.class)
public interface TicketProj {

    public Long getId();
    public String getNomClient();
    public double getPrix();
    public Integer getCodePayment();
    public boolean getReservee();
    public Place getPlace();

}
