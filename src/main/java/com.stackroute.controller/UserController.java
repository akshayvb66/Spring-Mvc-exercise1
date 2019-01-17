package com.stackroute.controller;


import com.stackroute.configuraion.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private User user= new User("Akshay");

    @RequestMapping(value="/")
    public String userName(ModelMap map){

        map.addAttribute("name",user.getName());

        return "index";
    }
}
