package com.example.adhar.services;
import com.example.adhar.entity.Adhar;
import com.example.adhar.repos.AdharRepository;
import com.example.users.entity.User;
import com.example.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
public class AdharService {
    @Autowired
    AdharRepository adharRepository;
    @Autowired
    UserRepository userRepository;
     public AdharService(AdharRepository adharRepository){
         this.adharRepository=adharRepository;
     }

    public  Adhar createUserAdhar(Adhar adhar,int userId){
         User user= userRepository.findById(userId);
         System.out.println(user);
         adhar.setUser(user);
        return adharRepository.save(adhar);
    };
    public Adhar getUserAdhar(int id){
        return adharRepository.findById(id);
    }
}
