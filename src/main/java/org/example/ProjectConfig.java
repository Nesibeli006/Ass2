package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @org.springframework.context.annotation.Lazy
    public Lazy lazy() {
        return new Lazy();
    }

    @Bean
    public Eager eager() {
        return new Eager();
    }
}
