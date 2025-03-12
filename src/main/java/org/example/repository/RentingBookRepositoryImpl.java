package org.example.repository;

import org.example.model.RentingBook;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class RentingBookRepositoryImpl implements RentingBookRepository {


    public void storeRenting(RentingBook rentingBook) {
        System.out.println("rented book title: " + rentingBook.getTitle());
    }
}
