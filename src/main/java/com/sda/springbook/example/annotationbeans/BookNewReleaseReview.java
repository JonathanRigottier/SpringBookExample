package com.sda.springbook.example.annotationbeans;

import com.sda.springbook.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "bookNewReleaseReview")
public class BookNewReleaseReview implements BeanName {
    private final String review;

    public BookNewReleaseReview() {
        this.review = "Average book, nothing special !";
    }

    @Override
    public String getReview() {
        return this.review;
    }
}
