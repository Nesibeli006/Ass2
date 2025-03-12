package org.example.proxy;

import org.example.model.RentingBook;

public interface SmsReaders {

    void sendSms(RentingBook rentingBook);
}
