package com.bilgeadam.service;

import com.bilgeadam.repository.AuthorRepository;
import com.bilgeadam.repository.BookRepository;
import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.utility.MyFactoryService;

public class AuthorService extends MyFactoryService<AuthorRepository, Author,Long> {

    public AuthorService() {
        super(new AuthorRepository());
    }
}
