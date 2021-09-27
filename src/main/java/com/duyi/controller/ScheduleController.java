package com.duyi.controller;

import com.duyi.service.ScheduleService;
import com.duyi.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleService service;

    @RequestMapping("schedule")
    @ResponseBody
    public List<ScheduleVo> selectByFilmId(String filmId){
        List<ScheduleVo> voList=service.selectByFilmId(filmId);
        return voList;
    }
}
