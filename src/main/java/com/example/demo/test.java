package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class test {
@RequestMapping("/test")
    public String handerString(){
    return "Just for testing!!";
}
}
