package com.example.users.apis;

import com.example.users.entity.User;
import com.example.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.users.repos.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {


    @Autowired(required = false)
    private UserService userService;
    @PostMapping("/users")
     public User createUser(@RequestBody User user){
        return userService.createUser(user);
     }

     @GetMapping("/users/{userId}")
     public User getUser(@PathVariable(name = "userId") int userId){
        return userService.getUser(userId);
     }
     @GetMapping("/users")
     public List<User> getUsers(){
        System.out.println("success");
         return userService.getAllUsers();
     }

    @PutMapping("/users")
    private User update(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{userId}")
    private String delete(@PathVariable("userId") int userId)
    {
        return userService.deleteUser(userId);
    }
}
