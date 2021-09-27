package com.duyi.service;

import com.duyi.dao.FilmMapper;
import com.duyi.entity.Film;
import com.duyi.vo.FilmDetailVo;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmMapper filmDao;

    //返回影片相关（所有）基本信息
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

    //返回影片详情
    public FilmDetailVo findFilmById(String filmId){
        Film film=filmDao.findFilmById(filmId);
        FilmDetailVo filmDetailVo=new FilmDetailVo();
        filmDetailVo.setFilmId(film.getFilm_id());
        filmDetailVo.setFname(film.getFname());
        filmDetailVo.setCountry(film.getCountry());
        filmDetailVo.setDirector(film.getDirector());
        // 剧情 爱情等 可以存储到额外的类型表中
        // 剧情-1 爱情-2 film - type [1,2] 再去type表中取具体的描述
        filmDetailVo.setFtype(film.getFtype());
        filmDetailVo.setLength(film.getLength());
        filmDetailVo.setPosterPath(film.getPoster_path());
        filmDetailVo.setReleaseTime(film.getRelease_time());
        filmDetailVo.setRole(film.getRole());
        filmDetailVo.setSynopsis(film.getSynopsis());
        return filmDetailVo;
    }

}

