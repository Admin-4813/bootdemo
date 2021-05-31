package com.example.demo.Mapper;

import com.example.demo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> UserByName(@Param("username") String username);

}
