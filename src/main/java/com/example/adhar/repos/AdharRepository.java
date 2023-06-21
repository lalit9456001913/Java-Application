package com.example.adhar.repos;

import com.example.adhar.entity.Adhar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdharRepository extends JpaRepository<Adhar, Integer> {
    Adhar findById(int id);
}
