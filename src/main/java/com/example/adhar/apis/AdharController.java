package com.example.adhar.apis;
import com.example.adhar.entity.Adhar;
import com.example.adhar.services.AdharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class AdharController {
    @Autowired
    AdharService adharService;

    @PostMapping("/users/{userId}/adhar")
    public Adhar createUserAdhar(@RequestBody  Adhar adhar,@PathVariable(name = "userId") UUID userId){
        System.out.println(adhar);
        return adharService.createUserAdhar(adhar,userId);
    }

    @GetMapping("/users/{userId}/adhar")
    public Adhar getUserAdhar(@PathVariable(name = "userId") int userId){
        return adharService.getUserAdhar(userId);
    }

}

