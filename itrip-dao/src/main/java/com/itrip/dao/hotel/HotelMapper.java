package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

public interface HotelMapper {
    /**
     * 查询所有旅店
     * @return
     */
    public List<Hotel> getHotels();
}
