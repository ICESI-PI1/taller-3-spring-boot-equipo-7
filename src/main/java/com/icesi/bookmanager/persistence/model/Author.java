package com.icesi.bookmanager.persistence.model;

import java.util.ArrayList;

public class Author {
    private Long id;
    private String name;
    private String nationality;

    public Author(Long id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
