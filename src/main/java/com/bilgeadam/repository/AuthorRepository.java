package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.utility.MyFactoryRepository;

public class AuthorRepository extends MyFactoryRepository<Author,Long> {

    public AuthorRepository() {
        super(new Author());
    }
}
