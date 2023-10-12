package com.icesi.bookmanager.services;

import com.icesi.bookmanager.persistence.model.Author;
import com.icesi.bookmanager.persistence.model.Book;

import java.util.List;

public interface IBookManagerService {
    List<Book> listAllBooks();
    List<Author> listAllAuthors();
    Book getBookById(Long id);
    Author getAuthorById(Long id);
    Boolean deleteBook(Long id);
    Boolean deleteAuthor(Long id);

}
