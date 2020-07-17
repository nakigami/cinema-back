package com.cinemas.backed;

import com.cinemas.backed.dao.CinemaRepository;
import com.cinemas.backed.entities.Cinema;
import com.cinemas.backed.entities.Film;
import com.cinemas.backed.entities.Salle;
import com.cinemas.backed.entities.Ticket;
import com.cinemas.backed.services.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class BackedApplication implements CommandLineRunner{

    @Autowired
    ICinemaInitService iCinemaInitService;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(BackedApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Salle.class, Film.class, Ticket.class);
        iCinemaInitService.initVilles();
        iCinemaInitService.initCinemas();
        iCinemaInitService.initSalles();
        iCinemaInitService.initPlaces();
        iCinemaInitService.initSeances();
        iCinemaInitService.initCategories();
        iCinemaInitService.initFilms();
        iCinemaInitService.initProjections();
        iCinemaInitService.initTickets();
    }
}
