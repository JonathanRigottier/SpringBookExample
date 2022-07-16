package com.sda.springbook.example.beans;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service("myBean")
public class MyBean {
    private static final String TITLE = "The book name is ";

    private String bookName;
    private String bookAuthor;

    public String bookPresentation() {
        return TITLE.concat(bookName).concat(" written by " + bookAuthor +".");
    }


}
