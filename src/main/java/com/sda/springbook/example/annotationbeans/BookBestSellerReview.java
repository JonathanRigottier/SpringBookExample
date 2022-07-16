package com.sda.springbook.example.annotationbeans;

import com.sda.springbook.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "bookBestSellerReview")
public class BookBestSellerReview implements BeanName {
    private final String review;

    public BookBestSellerReview() {
        this.review = "Excellent book !";
    }

    @Override
    public String getReview() {
        return this.review;
    }
}
