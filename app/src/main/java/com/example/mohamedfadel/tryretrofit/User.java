package com.example.mohamedfadel.tryretrofit;

public class User {

    String name;
    String email;
    String phone;
    String website;

    public User(String name, String email, String phone, String website) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
}
