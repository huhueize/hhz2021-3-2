package com.example.demo.service;


import com.example.demo.dao.UserInfoDao;
import com.example.demo.dto.UserDto;
import org.apache.catalina.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserInfoServiceTest {


    private Logger log = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoService userInfoService;

    @Test
     void getUserById(){
        UserDto userDto = userInfoService.getUserDtoById("1");
        System.out.println("userDto" + userDto);
    }


    @Test
    void addUserDto(){
        UserDto userDto = new UserDto("2","hhz");
        userInfoService.addUserDto(userDto);
    }

    @Test
    void modifyUserDto(){
        UserDto userDto = new UserDto("3","hhz1");
        userInfoService.modifyUserDto(userDto);
    }

    @Test
    void getAllUserDto(){
        System.out.println(userInfoService.findAll());
    }

    @Test
    void deleteUserDtoById() {
        boolean bool=userInfoService.deleteUserDtoById("3");
        if(bool){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

//    @Test
//    void getUserInfo(){
//        UserDto userDto = userInfoService.getUserDto();
//    }
//    @Test
//    void addUser(){
//        UserDto userDto = new UserDto();
//        userDto.setUserName("老胡");
//        userDto.setId("2");
//
//        boolean flag = userInfoService.addUser(userDto);
//    }
//
//    @Test
//    void getUserById(){
//        UserDto userDto = userInfoService.getUserInfoById("1");
//    }


}
