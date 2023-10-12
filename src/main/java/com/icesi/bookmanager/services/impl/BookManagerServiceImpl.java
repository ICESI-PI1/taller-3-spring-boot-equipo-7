package com.icesi.bookmanager.services.impl;

import com.icesi.bookmanager.persistence.model.Author;
import com.icesi.bookmanager.persistence.model.Book;
import com.icesi.bookmanager.persistence.repositories.IBookManagerRepository;
import com.icesi.bookmanager.services.IBookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerServiceImpl implements IBookManagerService {

   @Autowired
    private IBookManagerRepository repository;

    public BookManagerServiceImpl(IBookManagerRepository repository) {
        this.repository = repository;
    }

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
