package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.AuthorService;
import com.bilgeadam.service.BookService;

import java.util.List;
import java.util.Optional;

public class AuthorController {
    AuthorService authorService;
    public AuthorController() {
        this.authorService = new AuthorService();
    }


    public  Author createAuthor(Author author){
        return authorService.save(author);
    }

    public List<Author> findAll(){
        return  authorService.findAll();
    }

    public Optional<Author> findById(long id) {

        return authorService.findById(id);
    }
}
