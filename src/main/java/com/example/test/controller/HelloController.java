package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        System.out.println(1);
        return "index";
    }

}
