package com.example.Address.apis;

import com.example.Address.entity.Address;
import com.example.Address.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/users/{userId}/address")
    public Address createAddress(@RequestBody Address address, @PathVariable(name="userId") int userId){
        return addressService.createAddress(address,userId);
    }
    @GetMapping("/users/{userId}/address")
    public List<Address> getUserAddress(@PathVariable(name = "userId") int userId) {
        return addressService.getAddresses(userId);
    }

}
