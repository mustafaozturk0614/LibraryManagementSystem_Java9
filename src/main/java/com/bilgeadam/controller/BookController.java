package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.BookService;

import java.util.List;

public class BookController {

    BookService bookService;

    public BookController() {
        this.bookService = new BookService();
    }

    public Book createBook(Book book){
        return  bookService.save(book);
    }

    public List<Book> findAll(){
        return  bookService.findAll();
    }
}
