package com.example.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Practice {
    @RequestMapping("/home")
    public String fun()
    {
        return "hii";
    }
}
