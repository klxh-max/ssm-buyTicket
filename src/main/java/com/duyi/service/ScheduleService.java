package com.duyi.service;

import com.duyi.dao.RoomMapper;
import com.duyi.dao.ScheduleMapper;
import com.duyi.entity.Room;
import com.duyi.entity.Schedule;
import com.duyi.vo.ScheduleDetailVo;
import com.duyi.vo.ScheduleVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private RoomMapper roomMapper;

    public List<ScheduleVo> selectByFilmId(String filmId) {
        List<Schedule> scheduleList = scheduleMapper.selectByFilmId(filmId);
        List<ScheduleVo> result = new ArrayList<>();
        for (Schedule schedule : scheduleList) {
            ScheduleVo vo = new ScheduleVo();
            vo.setFilmId(schedule.getFilmId());
            vo.setFilmName(schedule.getFilmName());
            vo.setRoomId(schedule.getRoomId());
            vo.setRoomName(schedule.getRoomName());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = format.format(schedule.getScheduleTime());

            vo.setScheduleTime(dateStr);
            vo.setScheduleId(schedule.getScheduleId());
            vo.setLanType(schedule.getLanType());
            vo.setPrice(schedule.getPrice());
            result.add(vo);
        }
        return result;
    }

    public ScheduleDetailVo getDetailVoById(String scheduleId) {
        Schedule schedule= scheduleMapper.selectByScheduleId(scheduleId);
        ScheduleDetailVo detailVo=new ScheduleDetailVo();
        //将schedule和detailVo属性名相同且类型相同的拷贝过去
        BeanUtils.copyProperties(schedule,detailVo);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(schedule.getScheduleTime());
        detailVo.setScheduleTimeStr(dateStr);

        Room room=roomMapper.selectByRoomId(schedule.getRoomId());
        detailVo.setSeat(room.getSituation());

        return detailVo;
    }



}
