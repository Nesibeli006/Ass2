package org.example;

import org.example.model.RentingBook;
import org.example.service.RentingBookServise;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Lazy lazy = context.getBean( Lazy.class);

        RentingBook rentingBook = new RentingBook();
        rentingBook.setAuthor("James Bond");
        rentingBook.setTitle("The Hobbit");
        rentingBook.setPrice(5.5);
        rentingBook.setReader("Nesibeli");

        RentingBookServise rentingBookServise = context.getBean(RentingBookServise.class);
        rentingBookServise.publicRentingBook(rentingBook);
    }
}
