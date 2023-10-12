package com.icesi.bookmanager.persistence.model;

import java.util.ArrayList;

public class Author {
    private Long id;
    private String name;
    private String nationality;

    private ArrayList<Book> books;

    public Author(Long id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        books = new ArrayList<Book>();
    }
}
