package me.circlehotarux.eghibli.service;

import me.circlehotarux.eghibli.entity.Film;

import java.util.List;

public interface FilmService {
    // 获取所有电影
    List<Film> getFilms();

    // 搜索电影
    List<Film> searchFilms(String text);

    // 查找电影
    Film getFilm(String filmId);
}
