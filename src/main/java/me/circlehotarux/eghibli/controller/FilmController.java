package me.circlehotarux.eghibli.controller;

import me.circlehotarux.eghibli.entity.Film;
import me.circlehotarux.eghibli.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/film")
public class FilmController {

    // 创建连接数据库的接口实例
    @Autowired
    private FilmService filmService;

    // 监听'/film/get' 返回所有电影数据
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Film> getFilms() {
        List<Film> films = filmService.getFilms();
        return  films;
    }

    // 监听'/film/search' 接收一个参数 返回过滤后的电影数据
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Film> searchFilms(@RequestParam("filter") String filter){
        List<Film> films = filmService.searchFilms(filter);
        return films;
    }
}
