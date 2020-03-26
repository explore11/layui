package com.example.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/menu")
    public String getMenu(){
//        return "menu";
//        return "card";
//        return "card1";
//        return "faceCard";
//        return "flag";
//        return "line";
//        return "action";
//        return "color";
//        return "carousel";
        return "date";
    }
}
