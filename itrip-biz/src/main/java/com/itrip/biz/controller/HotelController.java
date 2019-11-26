package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hs;

    @RequestMapping(value="/hotel/queryHotels",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public Dto queryHotels(){
        List<Hotel> hotels=hs.getHotels();
        return DtoUtil.returnSuccess("查询旅店成功",hotels);
    }


}
