package com.duyi.vo;

import java.util.Date;

public class FilmDetailVo {

    private String filmId; // filmId 驼峰也可 需要额外配置
    private String fname;
    private String director;
    private String role;
    private String ftype;
    private String country;
    private int length;
    private String synopsis;
    private Date releaseTime;
    private String posterPath;

    public FilmDetailVo() {}

    public FilmDetailVo(String filmId, String fname, String director, String role, String ftype, String country, int length, String synopsis, Date releaseTime, String posterPath) {
        this.filmId = filmId;
        this.fname = fname;
        this.director = director;
        this.role = role;
        this.ftype = ftype;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.releaseTime = releaseTime;
        this.posterPath = posterPath;
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

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
