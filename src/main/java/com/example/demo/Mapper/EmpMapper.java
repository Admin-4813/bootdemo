package com.example.demo.Mapper;

import com.example.demo.po.Dept;
import com.example.demo.po.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> emplist();
    List<Dept> deptlist();
    void save(Emp emp);
    void updates(Emp emp);
}
