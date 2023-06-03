package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.utility.MyFactoryRepository;

public class BorrowRepository extends MyFactoryRepository<Borrow,Long> {


    public BorrowRepository() {
        super(new Borrow());
    }
}
