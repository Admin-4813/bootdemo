package com.example.demo.restful;

import com.example.demo.po.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class Thymeleaf {

    @RequestMapping("final.do")
    public String Finall(Model model){
        ArrayList<Object> list = new ArrayList<>();
        for (int i=20;i<31;i++){
            Dept dept = new Dept();
            dept.setDeptno(i);
            dept.setName("name"+i);
            list.add(dept);
        }
        model.addAttribute("list",list);
        return "show";
    }


}
