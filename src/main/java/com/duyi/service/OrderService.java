package com.duyi.service;

import com.duyi.dao.OrderMapper;
import com.duyi.entity.Order;
import com.duyi.util.RandomUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public int addOrder(String scheduleId, int cnt, String seatStr, BigDecimal onePrice) {
        Order order = new Order();
        //生成id的随机算法
        order.setOrderId(RandomUtil.getRandomString(10));
        order.setScheduleId(scheduleId);
        order.setSeatNum(cnt);
        order.setPrice(new BigDecimal(cnt).multiply(onePrice));
        //假设每排不超过9个座位
        String[] seats = seatStr.split("-");
        String seat = seats[0];
        List<String> seatList = new ArrayList<>();
        for (int i = 1; i < seats.length - 1; i++) {
            seat += "-" + seats[i].substring(0, 1);
            seatList.add(seat);
            seat = seats[i].substring(1);
        }
        seat += "-" + seats[seats.length - 1];
        seatList.add(seat);
        order.setSeat(new Gson().toJson(seatList));
        return orderMapper.insert(order);

    }

    public List<String> sold(String scheduleId) {
        List<Order> orderList = orderMapper.getSeatsByScheduleId(scheduleId);
        List<String> seats=new ArrayList<>();
        for (Order order : orderList) {
            List<String> seatList=new Gson().fromJson(order.getSeat(),List.class);
            for (String seat:seatList){
                seats.add(seat);
            }
        }
        return seats;
    }

}
