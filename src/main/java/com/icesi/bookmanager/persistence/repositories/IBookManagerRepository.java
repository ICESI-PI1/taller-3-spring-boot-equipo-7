package com.icesi.bookmanager.persistence.repositories;

import com.icesi.bookmanager.persistence.model.Author;
import com.icesi.bookmanager.persistence.model.Book;

import java.util.List;

public interface IBookManagerRepository {
    List<Book> listAllBooks();
    List<Author> listAllAuthors();
    Book getBookById(Long id);
    Author getAuthorById(Long id);
    Boolean deleteBook(Long id);
    Boolean deleteAuthor(Long id);
    Book createBook(Book book);
    Book updateBook(Long id, Book updatedBook);
    Author createAuthor(Author author);
    Author updateAuthor(Long id, Author updatedAuthor);
    List<Book> getBooksByAuthor(Long id);

}
