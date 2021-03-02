package com.example.demo.service;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    private Logger log = LoggerFactory.getLogger(UserInfoService.class);

    public UserDto getUserDtoById(String id) {
        log.info("UserInfoService-getUserDto,出参，当前用户：{}",userInfoDao.findById(id).get().getUserName());
        return userInfoDao.findById(id).get();
    }


    public List<UserDto> findAll() {
        return userInfoDao.findAll();
    }

    public UserDto update(UserDto userDto) {
        return userInfoDao.save(userDto);
    }

    public void addUserDto(UserDto userDto){
        userInfoDao.save(userDto);
        log.info("UserInfoService-getUserDto,出参，当前用户：{}",userDto.getUserName());
    }

    public boolean modifyUserDto(UserDto userDto){
        Optional<UserDto> userOpt = userInfoDao.findById(userDto.getId());
        if(userOpt.isPresent()){
            userInfoDao.save(userDto);
            log.info("UserInfoService-modifyUserDto,入参，当前用户：{}",userDto.getUserName());
            return true;
        }else {
            System.out.println("用户不存在");
            return false;
        }
    }

    public boolean deleteUserDtoById(String id){
        UserDto userDto=getUserDtoById(id);
        if(userDto!=null){
            userInfoDao.deleteById(id);
            log.info("UserInfoService-deleteUserDtoById,入参");
            return true;
        }else {
            System.out.println("用户不存在");
            return false;
        }

    }

//    private Logger log = LoggerFactory.getLogger(UserInfoService.class);
//
//    public UserDto getUserDto(){
//        UserDto userDto = new UserDto();
//
//        userDto.setId("1");
//        userDto.setUserName("小胡");
//        log.info("UserInfoService-getUserDto,出参，当前用户：{}",userDto.getUserName());
//
//        return userDto;
//
//    }
//
//    public boolean addUser(UserDto userDto){
//        if(userDto!=null){
//            log.info("UserInfoService - addUser,添加用户成功，当前用户：{}",userDto.getUserName());
//        }else {
//            log.error("UserInfoService - addUser,添加用户失败，失败原因：用户实体为空");
//        }
//        return true;
//    }
//
//    public UserDto getUserInfoById(String id){
//        UserDto userDto = new UserDto();
//        userDto.setId(id);
//        userDto.setUserName("hhz");
//
//        log.info("UserInfoService-getUserDto,出参，当前用户：{}",userDto.getUserName());
//
//        return userDto;
//
//    }
}
