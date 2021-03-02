package com.example.demo.dao;

import com.example.demo.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserDto,String> {
//    List<UserDto> findByUserDtoIn(List<String> UserDtoList);
}
