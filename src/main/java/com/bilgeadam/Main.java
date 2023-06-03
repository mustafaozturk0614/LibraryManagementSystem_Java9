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


    }

    public static void  createData(){
        Author author= Author.builder().firstName("KEMAL").lastName("TAHIR").build();
        AuthorController authorController=new AuthorController();
        //    authorController.createAuthor(author);
        //    System.out.println(author);
        Book book=Book.builder().
                title("Hür Sehrin insanları").bookType(EBookType.HISTORY).author(author).build();
        Book book2=Book.builder().
                title("Esir Sehrin insanları").bookType(EBookType.HISTORY).author(author).build();
        Book book3=Book.builder().
                title("Yorgun savascı").bookType(EBookType.HISTORY).author(author).build();
        author.setBooks(List.of(book,book2,book3));
        authorController.createAuthor(author);

        Author author1= Author.builder().firstName("Albert").lastName("Camus").build();
        Book book4= Book.builder().title("Yabancı").bookType(EBookType.NOVEL).author(author1).build();
        Book book5= Book.builder().title("Mutlu ölüm").bookType(EBookType.NOVEL).author(author1).build();
        Book book6= Book.builder().title("Sisifos Söyleni").bookType(EBookType.NOVEL).author(author1).build();
        author1.setBooks(List.of(book4,book5,book6));
        authorController.createAuthor(author1);
//        BookController bookController=new BookController();
//        bookController.createBook(book);

        //// user olusturma
        Address address1=Address.builder().country("Turkiye").city("Ankara").build();
        Address address2=Address.builder().country("Türkiye").city("Balıkesir").build();
        Address address3=Address.builder().country("Türkiye").city("Konya").build();
        Address address4=Address.builder().country("Türkiye").city("İzmir").build();
        Address address5=Address.builder().country("Türkiye").city("Amasya").build();
        Address address6=Address.builder().country("Türkiye").city("Erzincan").build();

        UserInformation userInformation=UserInformation.builder().firstName("Mustafa")
                .lastName("Ozturk")
                .address("Ankara")
                .phoneNumber("5555-555-55-5")
                .about("hakkımda........")
                .addresses(List.of(address1 ,address2))
                .build();

        UserInformation userInformation2=UserInformation.builder().firstName("Tuba")
                .lastName("Ozturk")
                .address("Ankara")
                .phoneNumber("5555-555-55-5")
                .about("hakkımda........")
                .addresses(List.of(address1 ,address3,address4))
                .build();
        UserInformation userInformation3=UserInformation.builder().firstName("Derya")
                .lastName("Ozturk")
                .address("Ankara")
                .phoneNumber("5555-555-55-5")
                .about("hakkımda........")
                .addresses(List.of(address5 ,address6))
                .build();

        User user= User.builder().username("musty").password("123")
                .userInformation(userInformation)
                .build();
        User user2=User.builder().username("tuba").password("123").userInformation(userInformation2).build();
        User user3=User.builder().username("derya").password("123").userInformation(userInformation3).build();
        //
        UserController userController=new UserController();
        userController.createUser(user);
        userController.createUser(user2);
        userController.createUser(user3);

    }
}