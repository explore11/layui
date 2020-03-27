package com.example.layui.controller;

import com.example.layui.domain.User;
import com.example.layui.dto.UserDTO;
import com.example.layui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;


    @GetMapping("/toUserList")
    public ModelAndView listUI() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user");
        return modelAndView;
    }


    @GetMapping("/user/queryAll")
    public UserDTO<User> queryAll(ModelAndView modelAndView) {
        List<User> userList = userService.queryAll();
        UserDTO dto = new UserDTO();
        dto.setCode(200);
        dto.setCount(100);
        dto.setMsg("成功");
        dto.setData(userList);
        modelAndView.setViewName("/table");
        return dto;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/menu")
    public String getMenu() {
//        return "menu";
//        return "card";
//        return "card1";
//        return "faceCard";
//        return "flag";
//        return "line";
//        return "action";
//        return "color";
//        return "carousel";
//        return "date";
//        return "form";
//        return "formElement";
//        return "layer";
//        return "layerMore";
        return "table";
    }
}
