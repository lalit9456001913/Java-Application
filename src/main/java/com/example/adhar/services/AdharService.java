package com.example.adhar.services;
import com.example.adhar.entity.Adhar;
import com.example.adhar.repos.AdharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AdharService {
    @Autowired
    AdharRepository adharRepository;
     public AdharService(AdharRepository adharRepository){
         this.adharRepository=adharRepository;
     }

    public  Adhar createUserAdhar(Adhar adhar){
        return adharRepository.save(adhar);
    };
}
