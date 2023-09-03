package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    // getter, setter, etc.

    // idのgetter
    public Long getId() {
        return id;
    }

    // idのsetter
    public void setId(Long id) {
        this.id = id;
    }

    // usernameのgetter
    public String getUsername() {
        return username;
    }

    // usernameのsetter
    public void setUsername(String username) {
        this.username = username;
    }

    // passwordのgetter
    public String getPassword() {
        return password;
    }

    // passwordのsetter
    public void setPassword(String password) {
        this.password = password;
    }

    // ... 他のフィールドに対するgetterとsetterも同様に追加
}
