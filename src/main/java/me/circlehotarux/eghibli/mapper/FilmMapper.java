package me.circlehotarux.eghibli.mapper;

import me.circlehotarux.eghibli.entity.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmMapper {
    Film getFilm(String filmId);
    List<Film> getFilms();
    List<Film> searchFilms(String filter);
}
