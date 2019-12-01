package com.ztkj.bean;

public class User {
    private Integer uId;
    private String name;
    private int age;

    public User() {
    }

    public User(Integer uId, String name, int age) {
        this.uId = uId;
        this.name = name;
        this.age = age;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
