package com.sda.springbook.example;

import com.sda.springbook.example.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBookExampleApplication {

    public static void main(String[] args) {
        xmlBean();
    }

    private static void xmlBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBeanService = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBeanService.bookPresentation());

        myBeanService.setBookName("Sunset");
        myBeanService.setBookAuthor("Jessie Cave");
        System.out.println(myBeanService.bookPresentation());
    }
}
