package com.bilgeadam.service;

import com.bilgeadam.repository.BookRepository;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.utility.MyFactoryService;

public class BookService  extends MyFactoryService<BookRepository, Book,Long> {

    public BookService() {

        super(new BookRepository());
    }
}
