package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.service.BookService;
import com.bilgeadam.service.BorrowService;

import java.util.List;
import java.util.Optional;

public class BorrowController {
    BorrowService borrowService;
    public BorrowController() {
        this.borrowService = new BorrowService();
    }

    public Borrow createBorrow(Borrow borrow){
        borrowService.setReturnDate(borrow);
        return  borrowService.save(borrow);
    }

    public List<Borrow> findAll(){
        return  borrowService.findAll();
    }

    public Borrow finById(Long id){
        Optional<Borrow> borrow=borrowService.findById(id);
        if (borrow.isPresent()){
            return  borrow.get();
        }
        throw new RuntimeException("Kiralama bulunamadı");
    }

    public void deleteById(long id){
        borrowService.deleteBorrow(id);
    }

}
