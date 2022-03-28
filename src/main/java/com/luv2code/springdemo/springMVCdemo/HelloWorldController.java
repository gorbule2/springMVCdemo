package com.luv2code.springdemo.springMVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    //need a controller method to process the HTML form
}