package com.duyi.controller;

import com.duyi.service.ScheduleService;
import com.duyi.vo.ScheduleDetailVo;
import com.duyi.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleService service;

    @RequestMapping("schedule")
    public String selectByFilmId(String filmId, Model model){
        List<ScheduleVo> voList=service.selectByFilmId(filmId);
        model.addAttribute("voList",voList);
        return "schedule";
    }

    @RequestMapping("seat")
    public String showSeats(String scheduleId,Model model){
        ScheduleDetailVo detailVo=service.getDetailVoById(scheduleId);
        model.addAttribute("detailVo",detailVo);
        return "seat";
    }
}
