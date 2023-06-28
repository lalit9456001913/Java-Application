package com.example.Address.repos;

import com.example.Address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findByUserId(UUID userId);
}
