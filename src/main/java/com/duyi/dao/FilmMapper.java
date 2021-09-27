package com.duyi.dao;

import com.duyi.entity.Film;

import java.util.List;

public interface FilmMapper {

    //查找所有影片信息
    public List<Film> findAll();

    //根据film_id查找对应影片信息
    public Film findFilmById(String filmId);
}
