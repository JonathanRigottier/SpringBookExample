package com.sda.springbook.example.annotationbeans;

import com.sda.springbook.example.interfaces.BeanName;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BookReviewData {

    private BeanName beanName;

    public BookReviewData(@Qualifier("bookBestSellerReview") BeanName review) {
        this.beanName = review;
    }
}
