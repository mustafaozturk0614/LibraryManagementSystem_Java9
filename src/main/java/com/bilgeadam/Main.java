package com.bilgeadam;

import com.bilgeadam.controller.AuthorController;
import com.bilgeadam.controller.BookController;
import com.bilgeadam.controller.UserController;
import com.bilgeadam.repository.entity.*;
import com.bilgeadam.repository.enums.EBookType;

import java.util.List;

/*
1- Kitap odunc(kiralama) alma  projesi
1- Kitaplarımız olacak -Yazarlarımız olacak -Kullanıcılarımız olacak



 */
public class Main {
    public static void main(String[] args) {
        Author author= Author.builder().firstName("KEMAL").lastName("TAHIR").build();
        AuthorController authorController=new AuthorController();
//       authorController.createAuthor(author);
//        System.out.println(author);

        Book book=Book.builder().
        title("Hür Sehrin insanları").bookType(EBookType.HISTORY).author(author).build();
        Book book2=Book.builder().
        title("Esir Sehrin insanları").bookType(EBookType.HISTORY).author(author).build();
        Book book3=Book.builder().
                title("Yorgun savascı").bookType(EBookType.HISTORY).author(author).build();
        author.setBooks(List.of(book,book2,book3));

        authorController.createAuthor(author);



//        BookController bookController=new BookController();
//        bookController.createBook(book);

        //// user olusturma
        User user= User.builder().username("musty")
                .userInformation( UserInformation.builder().firstName("Mustafa")
                        .lastName("Ozturk")
                        .address("Ankara")
                        .phoneNumber("5555-555-55-5")
                        .about("hakkımda........")
                        .addresses(List.of(Address.builder().country("Turkiye").city("Ankara").build(),
                                Address.builder().country("Türkiye").city("Balıkesir").build()))
                        .build())
                .build();
        //
        UserController userController=new UserController();
        userController.createUser(user);

    }
}