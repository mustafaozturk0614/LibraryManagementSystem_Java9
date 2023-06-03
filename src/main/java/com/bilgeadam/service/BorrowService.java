package com.bilgeadam.service;

import com.bilgeadam.repository.BorrowRepository;
import com.bilgeadam.repository.UserRepository;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.utility.MyFactoryService;

import java.util.Optional;

public class BorrowService extends MyFactoryService <BorrowRepository, Borrow,Long> {
    public BorrowService() {
        super(new BorrowRepository());
    }

    public void setReturnDate(Borrow borrow) {
        borrow.setReturnDate(borrow.getBorrowDate().plusDays(borrow.getPeriod()));
    }


    public void deleteBorrow(Long id){
        if (existById(id)){
            deleteById(id);
            System.out.println("id si "+id+" bir olan kiralama databseden başarı ile şilinmiştir.");
        }else{
            System.out.println("Boyle bir kullanıcı bulunamadı!!!");
        }
    }


}
