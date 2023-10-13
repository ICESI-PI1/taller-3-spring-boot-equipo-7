package com.icesi.bookmanager.controllers;

import com.icesi.bookmanager.persistence.model.Author;
import com.icesi.bookmanager.persistence.model.Book;
import com.icesi.bookmanager.services.IBookManagerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AuthorController {

    private IBookManagerService service;

    public AuthorController(IBookManagerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Author> listAllAuthors() {
        return service.listAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return service.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return service.createAuthor(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author updatedAuthor) {
        return service.updateAuthor(id, updatedAuthor);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteAuthor(@PathVariable Long id) {
        return service.deleteAuthor(id);
    }

    @GetMapping("/{id}/books")
    public List<Book> getBooksByAuthor(@PathVariable Long id) {
        return service.getBooksByAuthor(id);
    }
}
