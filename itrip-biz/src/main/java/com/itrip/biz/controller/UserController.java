package com.itrip.biz.controller;
import com.itrip.beans.dto.Dto;
import com.itrip.biz.service.hotel.UserService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping(value="/user",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public Dto DL(@RequestParam(value="userCode", required=false,defaultValue="itrip@163.com") String userCode){

        int row= us.getSelect(userCode);
        if(row==1){
            return DtoUtil.returnSuccess("登陆成功",row);
        }else {
            return DtoUtil.returnFail("登录失败","1");
        }
    }
}
