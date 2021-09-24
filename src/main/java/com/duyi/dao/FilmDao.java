package com.duyi.dao;

import com.duyi.entity.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FilmDao {

    @Select("select id,film_id,fname,director,role,ftype,country,length,synopsis,release_time,poster_path from film")
    public List<Film> findAll();
}
