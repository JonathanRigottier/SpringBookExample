package com.sda.springbook.example.configurations;

import com.sda.springbook.example.explicitbeans.BookMainData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExplicitBeanConfiguration {

    @Bean
    public BookMainData bookMainDataBean() {
        return new BookMainData("Science-fiction", 2021, "Australia");

    }
}
