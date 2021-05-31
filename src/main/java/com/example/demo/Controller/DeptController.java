package com.example.demo.Controller;

import com.example.demo.Mapper.EmpMapper;
import com.example.demo.po.Dept;
import com.example.demo.po.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    EmpMapper empMapper;
    @GetMapping("/depts")
    public String queryAll(Model model){
        System.out.println("update");
        List<Emp> list = empMapper.emplist();
        List<Dept> deptlist = empMapper.deptlist();
        model.addAttribute("msg",list);
        model.addAttribute("deptlist",deptlist);
        return "depts";

    }

    @PostMapping("/depts")
    public String save(Emp emp){
        empMapper.save(emp);
        return "redirect:/depts";
    }

    @PutMapping("/depts")
    public String update(Emp emp){
        empMapper.updates(emp);
        System.out.println(emp);
        System.out.println("update..........");
        return "redirect:/depts";
    }


}
