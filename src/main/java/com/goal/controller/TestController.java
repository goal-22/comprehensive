package com.goal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Goal
 * @Date: 2022/3/31 13:50
 */
@Controller
public class TestController {

    /**
     * 
     * @param model
     * @return
     */
    @GetMapping("/")
    public String test(Model model){
        model.addAttribute("hello","hello world!");
        return "test";
    }

}
