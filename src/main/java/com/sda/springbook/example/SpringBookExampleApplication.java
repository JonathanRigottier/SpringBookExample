package com.sda.springbook.example;

import com.sda.springbook.example.beans.MyBean;
import com.sda.springbook.example.configurations.ExplicitBeanConfiguration;
import com.sda.springbook.example.explicitbeans.BookMainData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBookExampleApplication {

    public static void main(String[] args) {
        xmlBean();

        javaBean();
    }

    private static void xmlBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBeanService = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBeanService.bookPresentation());

        myBeanService.setBookName("Sunset");
        myBeanService.setBookAuthor("Jessie Cave");
        System.out.println(myBeanService.bookPresentation());
    }

    private static void javaBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ExplicitBeanConfiguration.class);
        applicationContext.refresh();

        BookMainData bookMainData = applicationContext.getBean(BookMainData.class);
        System.out.println(bookMainData.toString());

        bookMainData = new BookMainData("Historial", 1969, "Japan");
        System.out.println(bookMainData.toString());
    }
}
