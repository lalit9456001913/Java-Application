package com.example.Course.apis;

import com.example.Course.entity.Course;
import com.example.Course.repos.CourseRepository;
import com.example.users.entity.User;
import com.example.users.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {
    @Autowired(required = false)
    User user;

    @Autowired(required = false)
    Course course;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/users/{userId}/course")
    public String createCourse(@PathVariable(name = "userId") int userId) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setName("User" + userId);

        Course course = new Course();
        course.setId(UUID.randomUUID());
        course.setName("Course" + 1);

        user.setLikedCourses(new HashSet<>());
        course.setUsers(new HashSet<>());

        user.getLikedCourses().add(course);
        course.getUsers().add(user);
        System.out.println(user);
        userRepository.save(user);

        return "Course added to User successfully.";

//            User user=new User();
//            user.setId(1);
//            user.setName("lalit");
////            userRepository.save(user);
//
//
//           Course course1=new Course();
//           course1.setId(1);
//           course1.setName("btech");
//           user.getLikedCourses().add(course1);
////        user.addCourse(course1);
//        course1.getUsers().add(user);
//        course1.addUser(user);


//        System.out.println("======user========"+user);
//        System.out.println("======course========"+course1);
//        courseRepository.save(course1);
//        userRepository.save(user);
//        return "created";
    }

}
