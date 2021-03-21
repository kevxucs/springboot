package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //@Value("${person.name}")
    String name;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world!" + " " + name;
    }
}