package com.example.demo.restful;

import com.example.demo.po.Dept;
import org.springframework.web.bind.annotation.*;

@RestController
public class restfuls {
    @GetMapping("/dept")
    public String gets(){
        System.out.println("查询全部");
        return "index";
    }
    @GetMapping("/dept/{deptno}")
    public String getbyid(@PathVariable("deptno") int deptno){
        System.out.println("查询编号为"+deptno);
        return "index";
    }
    @PostMapping("/dept")
    public String add(Dept dept){
        System.out.println("添加数据"+dept.getName());
        return "index";
    }
    @PutMapping("/dept")
    public String put(Dept dept){
        System.out.println("修改数据"+dept.getName());
        return "index";
    }
    @DeleteMapping("/dept/{deptno}")
    public String deletes(@PathVariable("deptno") int deptno){
        System.out.println("删除数据"+deptno);
        return "index";
    }

}
