package com.itrip.beans.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private  Integer id;
    private  String userCode;
    private  String userPassword;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode(){
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
