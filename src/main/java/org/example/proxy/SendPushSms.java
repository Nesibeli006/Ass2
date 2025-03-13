package org.example.proxy;

import org.example.model.RentingBook;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push sms")
public class SendPushSms implements SmsReaders {

    @Override
    public  void sendSms(RentingBook rentingBook){
        System.out.println("Sending push SMS to - " + rentingBook.getReader());
    }

//    public SendPushSms() {
//        System.out.println("Start rend a book ");
//    }
}
