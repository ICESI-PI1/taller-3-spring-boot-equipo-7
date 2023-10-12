package com.icesi.bookmanager.controllers;

import com.icesi.bookmanager.services.IBookManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class BookController {

    //Attributes
    private IBookManagerService service;

    public BookController(IBookManagerService service) {
        this.service = service;
    }

    @GetMapping("")
    public String listAllBooks(Model model){

        return "books";
    }
}
