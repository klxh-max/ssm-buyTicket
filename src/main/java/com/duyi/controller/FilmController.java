package com.duyi.controller;

import com.duyi.service.FilmService;
import com.duyi.vo.FilmDetailVo;
import com.duyi.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping("filmList")
    @ResponseBody
    public List<FilmVo> findAll(){
        return filmService.findAll();
    }

    @RequestMapping("home")
    public String home(Model model){
        System.out.println("接收首页请求");
        List<FilmVo> filmVoList=filmService.findAll();
        model.addAttribute("filmVoList",filmVoList);
        return "home";
    }

    @RequestMapping("filmInfo")
    public String filmInfo(String filmId,Model model){
        // 定义⼀个FilmDetailVo来将数据渲染到⻚⾯中
        FilmDetailVo filmDetailVo= filmService.findFilmById(filmId);
        model.addAttribute("filmDetailVo",filmDetailVo);
        return "detail";
    }

}
