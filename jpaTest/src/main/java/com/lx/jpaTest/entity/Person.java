package com.lx.jpaTest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    private long id;
    private String name;
    private String passWord;
    private String address;
    private String nation;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
