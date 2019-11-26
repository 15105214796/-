package com.itrip.dao.hotel;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public int getSelect(String userCode);
}
