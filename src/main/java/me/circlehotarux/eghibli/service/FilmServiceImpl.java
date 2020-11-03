package me.circlehotarux.eghibli.service;

import me.circlehotarux.eghibli.entity.Film;
import me.circlehotarux.eghibli.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;

    // 获取所有电影
    @Override
    public List<Film> getFilms() {
        List<Film> films = filmMapper.getFilms();
        return  films;
    }

    // 搜索电影
    @Override
    public List<Film> searchFilms(String text){
        String filter = "%"+text+"%";
        List<Film> films = filmMapper.searchFilms(filter);
        return films;
    }

    // 查找电影
    @Override
    public Film getFilm(String filmId){
        Film film = filmMapper.getFilm(filmId);
        return film;
    }
}
