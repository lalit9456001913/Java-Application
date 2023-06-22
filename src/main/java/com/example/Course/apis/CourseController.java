package com.example.Course.apis;

import com.example.Course.entity.Course;
import com.example.Course.repos.CourseRepository;
import com.example.users.entity.User;
import com.example.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {
//    @Autowired
    User user;

//    @Autowired
    Course course;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CourseRepository courseRepository;
    @PostMapping("/users/{userId}/course")
    public String createCourse(@PathVariable(name="userId") int userId){
        User user1=new User();
        user1.setId(4);
        user1.setName("amit");

        User user2=new User();
        user2.setId(5);
        user2.setName("saurabh");


        Course course1=new Course();
        course1.setId(41);
        course1.setName("btech");

        Course course2=new Course();
        course2.setId(42);
        course2.setName("mba");

        Set<User> set1 = new HashSet<User>();
        Set<Course> set2 = new HashSet<Course> ();
        set1.addAll(userRepository.findAll());
        set2.addAll(courseRepository.findAll());
        course1.setUsers(set1);
        course2.setUsers(set1);
        user1.setLikedCourses(set2);
        user2.setLikedCourses(set2);
        courseRepository.save(course1);
        courseRepository.save(course2);
        userRepository.save(user1);
        userRepository.save(user2);
//        System.out.println(user);
//        course.addUser(user);
        return "created";
    }

}
