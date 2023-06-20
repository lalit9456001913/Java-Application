package com.example.adhar.apis;
import com.example.adhar.entity.Adhar;
import com.example.adhar.services.AdharService;
import com.example.users.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdharController {
    @Autowired
    AdharService adharService;
    @GetMapping("/enter")
    public List<User> getUser(){
        System.out.println("Reach...");
        return null;
    }
    @PostMapping("/adhar")
    public Adhar createUserAdhar(@RequestBody  Adhar adhar){
        return adharService.createUserAdhar(adhar);
    }
    @RequestMapping("/home")
    public String fun()
    {
        System.out.println("hero");
        return "hero";
    }
}

