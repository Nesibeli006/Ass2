package org.example;

import org.example.proxy.SendPushSms;
import org.example.service.RentingBookServise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

//    @Bean
//    public SendPushSms sendPushSms() {
//        return new SendPushSms();
//    }
//
//
//    @Bean
//    @org.springframework.context.annotation.Lazy
//    public RentingBookServise rentingBookServise() {
//        return new RentingBookServise();
//    }


}
