package com.example.adhar.entity;


import jakarta.persistence.*;
import com.example.users.entity.User;
@Entity

public class Adhar {


    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Override
    public String toString() {
        return "Adhar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", user=" + user +
                '}';
    }

    private String adharNumber;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

