package com.example.users.services;
import com.example.users.entity.User;
import com.example.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public User getUser(int userId){
        return userRepository.findById(userId);
    }
    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "user deleted successfully";
    }
}
