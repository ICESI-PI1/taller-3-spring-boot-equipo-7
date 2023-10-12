package com.icesi.bookmanager.controllers;

import com.icesi.bookmanager.services.IBookManagerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AuthorController {

    private IBookManagerService service;

    public AuthorController(IBookManagerService service) {
        this.service = service;
    }

    @GetMapping("")
    public String listAllAuthors(Model model){


        return "autores";
    }
}
