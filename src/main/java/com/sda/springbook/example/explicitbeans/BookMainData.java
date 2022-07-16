package com.sda.springbook.example.explicitbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class BookMainData {
    private final String nameCategory;
    private final int yearOfRelease;
    private final String authorCountry;
}
