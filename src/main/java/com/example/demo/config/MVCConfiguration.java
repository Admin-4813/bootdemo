package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MVCConfiguration implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*路由跳转 无业务逻辑*/
        registry.addViewController("/dept.html").setViewName("dept");
        registry.addViewController("/depts.html").setViewName("depts");
        registry.addViewController("/student.html").setViewName("student");
    }
}
