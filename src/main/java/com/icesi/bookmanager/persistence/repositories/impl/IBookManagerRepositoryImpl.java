package com.icesi.bookmanager.persistence.repositories.impl;

import com.icesi.bookmanager.persistence.model.Author;
import com.icesi.bookmanager.persistence.model.Book;
import com.icesi.bookmanager.persistence.repositories.IBookManagerRepository;

import java.util.List;

public class IBookManagerRepositoryImpl implements IBookManagerRepository {

    @Override
    public List<Book> listAllBooks() {
        return null;
    }

    @Override
    public List<Author> listAllAuthors() {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public Author getAuthorById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteBook(Long id) {
        return null;
    }

    @Override
    public Boolean deleteAuthor(Long id) {
        return null;
    }
}
