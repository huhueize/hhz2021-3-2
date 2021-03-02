package com.example.demo.conteoller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserInfoService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Api(description = "用户信息增删改查测试接口",tags = "用户信息增删改查测试接口")
public class UserInfoController {

    private Logger log = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("userinfo")
    public List<UserDto> UserInfo(){
        return userInfoService.findAll();
    }

    @GetMapping("update")
    public UserDto update(UserDto userDto){
        return userInfoService.update(userDto);
    }


    @GetMapping("getUserInfoById")
    public UserDto getUserDtoById(String id){
        return userInfoService.getUserDtoById(id);
    }





}
