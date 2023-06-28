package com.example.Course.entity;

import com.example.users.entity.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Course {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;

    // Other course attributes...

    @ManyToMany(mappedBy = "likedCourses")
    private Set<User> users = new HashSet<>();

    // Constructors, getters, setters...

    public void addUser(User user) {
        users.add(user);
        user.getLikedCourses().add(this);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void removeUser(User user) {
        users.remove(user);
        user.getLikedCourses().remove(this);
    }
}
