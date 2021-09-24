package com.duyi.entity;

import java.io.Serializable;
import java.util.Date;

//实体类，数据库中的表映射
public class Film implements Serializable {

    private static final long serialVersionUID = -2442860671614507423L;

    private long id;
    private String film_id; // filmId 驼峰也可 需要额外配置
    private String fname;
    private String director;
    private String role;
    private String ftype;
    private String country;
    private int length;
    private String synopsis;
    private Date release_time;
    private String poster_path;

    public Film() {}

    public Film(long id, String film_id, String fname, String director, String role, String ftype, String country, int length, String synopsis, Date release_time, String poster_path) {
        this.id = id;
        this.film_id = film_id;
        this.fname = fname;
        this.director = director;
        this.role = role;
        this.ftype = ftype;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.release_time = release_time;
        this.poster_path = poster_path;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getRelease_time() {
        return release_time;
    }

    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
