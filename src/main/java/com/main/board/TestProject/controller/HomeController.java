package com.main.board.TestProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/log-in")
    public String LogIn(){

        return "thymeleaf/login";
    }

    @RequestMapping(value = "/find-user")
    public String FindUser(){
        return "thymeleaf/find-user";
    }
}
