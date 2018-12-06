package com.example.springbootdemo1.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class IndexController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "Hello,"+name;
    }
}
