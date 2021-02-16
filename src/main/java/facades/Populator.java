/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.MovieDTO;
import entities.Movie;
import java.lang.reflect.Array;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {

    public static void populate() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        MovieFacade mf = MovieFacade.getMovieFacade(emf);
        String[] CoolDudes1 = {"Annie", "Trankjær", "VJ"};
        String[] CoolDudes2 = {"seje reje", "Benjamin", "Niels Bohrr"};
        String[] CoolDudes3 = {"Mikkel", "Anton", "Ludvig"};
        mf.create(new MovieDTO(new Movie(1996, "Live of Nikolaj T", CoolDudes1)));
        mf.create(new MovieDTO(new Movie(2003, "Diablo II the Movie",  CoolDudes2)));
        mf.create(new MovieDTO(new Movie(2012, "2012", CoolDudes3)));

    }

    public static void main(String[] args) {
        populate();
    }
}
