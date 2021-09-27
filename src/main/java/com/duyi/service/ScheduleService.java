package com.duyi.service;

import com.duyi.dao.ScheduleMapper;
import com.duyi.entity.Schedule;
import com.duyi.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    public List<ScheduleVo> selectByFilmId(String filmId){
        List<Schedule> scheduleList=scheduleMapper.selectByFilmId(filmId);
        List<ScheduleVo> result = new ArrayList<>();
        for (Schedule schedule : scheduleList) {
            ScheduleVo vo = new ScheduleVo();
            vo.setFilmId(schedule.getFilmId());
            vo.setFilmName(schedule.getFilmName());
            vo.setRoomId(schedule.getRoomId());
            vo.setRoomName(schedule.getRoomName());

            System.out.println(schedule.getScheduleTime());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = format.format(schedule.getScheduleTime());

            vo.setScheduleTime(dateStr);
            System.out.println(vo.getScheduleTime());
            vo.setScheduleId(schedule.getScheduleId());
            vo.setLanType(schedule.getLanType());
            vo.setPrice(schedule.getPrice());
            result.add(vo);
        }
        return result;
    }
}
