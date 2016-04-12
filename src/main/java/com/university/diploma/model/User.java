package com.university.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 2/12/16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;
    @Column(name = "username")
    private String login;
    @Column(name = "password")
    private String password;
    @Column
    private String email;
    @Column(name = "id_social")
    private String socialId;

    public User() {
    }

    public User(int id, String login, String password, String email, String socialId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.socialId = socialId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", socialId='" + socialId + '\'' +
                '}';
    }
}
