package com.ws.model;

import java.util.Date;
import java.util.List;

public class Offender {
    private int offenderId;
    private String name;
    private int age;
    private Date dob;
    private List<ContactInfo> contacts;
    
    public int getOffenderId() {
        return offenderId;
    }
    public void setOffenderId(int offenderId) {
        this.offenderId = offenderId;
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
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public List<ContactInfo> getContacts() {
        return contacts;
    }
    public void setContacts(List<ContactInfo> contacts) {
        this.contacts = contacts;
    }
}
