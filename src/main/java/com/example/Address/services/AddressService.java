package com.example.Address.services;
import com.example.Address.entity.Address;
import com.example.Address.repos.AddressRepository;
import com.example.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.users.entity.User;

import java.util.List;
import java.util.UUID;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    UserRepository userRepository;
    public Address createAddress(Address address, UUID userId){
        User user = userRepository.findById(userId);
        address.setUser(user);
        return addressRepository.save(address);
    }

    public List<Address> getAddresses(UUID userId){
        return addressRepository.findByUserId(userId);
    }
}

