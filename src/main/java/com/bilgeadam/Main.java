package com.bilgeadam;

import com.bilgeadam.controller.AuthorController;
import com.bilgeadam.controller.BookController;
import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.enums.EBookType;

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

        BookController bookController=new BookController();
        bookController.createBook(book);


    }
}