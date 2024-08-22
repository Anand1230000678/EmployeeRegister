package com.example.Registration.entity;

import jakarta.persistence.*;

import java.lang.reflect.Array;
import java.util.Arrays;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    private long id;
    private String name;
    private String address;
    private String country;
    private String state;
    @ElementCollection
    private String[]qualification;
    private String religion;

    public  Users(){

    }


    public Users(long id, String name, String address, String country, String state,String[] qualification, String religion) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.state = state;
        this.qualification = qualification;
        this.religion = religion;
    }

    public String[] getQualification() {
        return qualification;
    }

    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    @Override
    public String toString() {
        return "Users{"+
                ", qualification=" + Arrays.toString(qualification)+
                '}';
    }
}
