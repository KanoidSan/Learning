package com.kanoidsan.Learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //mapping request to index file
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
