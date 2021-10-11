package com.duyi.dao;

import com.duyi.entity.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    Order selectByPrimaryKey(Long id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);

    List<Order> getSeatsByScheduleId(String scheduleId);
}