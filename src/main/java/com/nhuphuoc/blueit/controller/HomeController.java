package com.nhuphuoc.blueit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("title","This is attribute added from controller");
        return "home";
    }


}
