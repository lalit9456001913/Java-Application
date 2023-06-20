package com.example;

import com.example.users.entity.User;
import com.example.users.repos.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages={
        "com.example.users"})
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(Demo.class, args);
        System.out.println("hii");
    }
}
