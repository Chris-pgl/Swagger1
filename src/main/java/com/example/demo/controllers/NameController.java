package com.example.demo.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController

public class NameController {

    @GetMapping("/")
    public String sayHello(){
        return "Benvenuto!";
    }

    @GetMapping("/myname")
    @ApiOperation(value = "Il mio nome", tags = "{Nome}")
    public String myName(){
        return "Il mio nome è Christian";
    }



}
