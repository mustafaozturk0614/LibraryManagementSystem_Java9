package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.service.BookService;

public class BookController {

    BookService bookService;

    public BookController() {
        this.bookService = new BookService();
    }

    public Book createBook(Book book){
        return  bookService.save(book);
    }


}
