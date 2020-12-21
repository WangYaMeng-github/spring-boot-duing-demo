package com.duing.controller;

import com.duing.domain.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

@RequestMapping("/hello")
@ResponseBody
    public String hello(){

        return "Hello world";
    }
}
