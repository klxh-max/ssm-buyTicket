package com.duyi.vo;

//视图层对象，用来展示给用户
public class FilmVo {
    private String filmId;
    private String fname;
    private String director;
    private String poster_path;

    public FilmVo(String filmId, String fname, String director, String poster_path) {
        this.filmId = filmId;
        this.fname = fname;
        this.director = director;
        this.poster_path = poster_path;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
