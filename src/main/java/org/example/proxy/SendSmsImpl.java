package org.example.proxy;

import org.example.model.RentingBook;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendSmsImpl implements SmsReaders{

    @Override
    public void sendSms(RentingBook rentingBook){
        System.out.println("Send SMS to - " + rentingBook.getReader());
    }
}
