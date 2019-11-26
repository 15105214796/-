package com.itrip.biz.service.hotel.impl;

import com.itrip.biz.service.hotel.UserService;
import com.itrip.dao.hotel.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper um;

    @Override
    public int getSelect(String userCode) {
        return um.getSelect(userCode);
    }
}
