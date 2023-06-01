package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.utility.MyFactoryRepository;

public class BookRepository extends MyFactoryRepository<Book,Long> {


    public BookRepository() {
        super(new Book());
    }
}
