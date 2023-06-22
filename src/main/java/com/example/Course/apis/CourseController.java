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

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@RestController
public class CourseController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CourseRepository courseRepository;
    @PostMapping("/users/{userId}/course")
    public Course createCourse(@RequestBody Course course, @PathVariable(name="userId") int userId){
        User user=userRepository.findById(userId);
//        Set<User> set=new Set<User>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<User> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] ts) {
//                return null;
//            }
//
//            @Override
//            public boolean add(User user) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends User> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        }
//        set.add(user);
//        course.setUsers(set);
        return courseRepository.save(course);
    }

}
