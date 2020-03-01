package com.example.mvvm2.model;

public class User {

    private String name;
    private String tell;


    public User(String name, String tell) {
        this.name = name;
        this.tell = tell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
