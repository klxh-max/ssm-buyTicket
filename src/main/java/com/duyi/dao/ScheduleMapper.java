package com.duyi.dao;

import com.duyi.entity.Schedule;
import com.duyi.vo.ScheduleDetailVo;

import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schedule record);

    Schedule selectByPrimaryKey(Long id);

    List<Schedule> selectAll();

    int updateByPrimaryKey(Schedule record);

    //通过filmId找场次
    List<Schedule> selectByFilmId(String filmId);

    Schedule selectByScheduleId(String scheduleId);
}