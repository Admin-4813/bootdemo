package com.example.demo.po;

import lombok.Data;

@Data
public class Emp {
    private int eid;
    private String ename;
    private String sex;
    private Dept dept;
}
