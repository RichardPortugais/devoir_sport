package com.company.models;

import java.io.Serializable;

public class Person implements Serializable {
    private String id;
    private String name;
    private String Nationality;

    public Person(String id, String name, String nationality) {
        this.id = id;
        this.name = name;
        Nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}
