package com.duyi.controller;

import com.duyi.entity.Order;
import com.duyi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("buy")
    @ResponseBody
    public int buyTicket(String scheduleId,int cnt,String seatStr,BigDecimal onePrice){
        //如果传入的参数过多，可以通过创建一个类来接收
        //public String buyTicket(OrderVo orderVo)

        return orderService.addOrder(scheduleId, cnt, seatStr,onePrice);
    }

    @RequestMapping("sold")
    @ResponseBody
    public List<String> sold(String scheduleId){
        List<String> seats= orderService.sold(scheduleId);
        return seats;
    }

}
