/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class MovieDTO {

    private long id;
    private int year;
    private String title;
    private String actors[];

    public MovieDTO(int year, String title, String actors[]) {
        this.year = year;
        this.title = title;
        this.actors = actors;
    }

    public static List<MovieDTO> getMovieDtos(List<Movie> rms) {
        List<MovieDTO> rmdtos = new ArrayList();
        rms.forEach(rm -> rmdtos.add(new MovieDTO(rm)));
        return rmdtos;
    }

    public MovieDTO(Movie movie) {
        this.year = movie.getYear();
        this.title = movie.getTitle();
        this.actors = movie.getActors();
    }

    public long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieDTO{year=").append(year);
        sb.append(", title=").append(title);
        sb.append(", actors=").append(actors);
        sb.append('}');
        return sb.toString();
    }

}
