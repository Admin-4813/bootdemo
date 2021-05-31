package com.example.demo;

import com.example.demo.Mapper.EmpMapper;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EmpMapper deptMapper;
    @Autowired
    UserMapper userMapper;


    @Test
    void contextLoads() {

//        System.out.println(deptMapper.emplist());
//        System.out.println(deptMapper.deptlist());
        List<User> user = userMapper.UserByName("张");
        System.out.println(user);
    }
}
