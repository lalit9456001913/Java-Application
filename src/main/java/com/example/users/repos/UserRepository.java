package com.example.users.repos;

import java.util.Optional;
import java.util.UUID;
import com.example.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int userId);
}
