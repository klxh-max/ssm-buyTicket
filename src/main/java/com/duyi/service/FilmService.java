package com.duyi.service;

import com.duyi.dao.FilmDao;
import com.duyi.entity.Film;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmDao filmDao;

    public List<FilmVo> findAll() {
        List<Film> filmList = filmDao.findAll();
        System.out.println(filmList.size());
        List<FilmVo> result = new ArrayList<>();
        for (Film film : filmList) {
            FilmVo vo = new FilmVo(film.getFilm_id(), film.getFname(), film.getDirector(), film.getPoster_path());
            result.add(vo);
        }
        return result;
    }
}

