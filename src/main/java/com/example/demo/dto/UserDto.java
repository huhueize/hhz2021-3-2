package com.example.demo.dto;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "user")
public class UserDto {
    @Id
    private String id;
    @Column
    private String userName;

    public UserDto(){

    }

    public UserDto(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
