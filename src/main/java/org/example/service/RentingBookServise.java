package org.example.service;


import org.example.model.RentingBook;
import org.example.proxy.SmsReaders;
import org.example.repository.RentingBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class RentingBookServise {


    private final SmsReaders smsReaders;
    private final RentingBookRepository rentingBookRepository;

    @Autowired
    public RentingBookServise(@Qualifier("push sms")SmsReaders smsReaders, RentingBookRepository rentingBookRepository) {
        this.smsReaders = smsReaders;
        this.rentingBookRepository = rentingBookRepository;

    }

    public void publicRentingBook(RentingBook rentingBook) {
        System.out.println("Renting new book " + rentingBook);
        rentingBookRepository.storeRenting(rentingBook);
        smsReaders.sendSms(rentingBook);
    }


}
