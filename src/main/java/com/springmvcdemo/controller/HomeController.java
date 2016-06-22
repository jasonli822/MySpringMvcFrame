package com.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Home page controller
 */
@Controller
public class HomeController {

    @RequestMapping({"/","/home"})
    public String homePage(Model model) {
        model.addAttribute("message","Hello!");
        return "home";
    }
}