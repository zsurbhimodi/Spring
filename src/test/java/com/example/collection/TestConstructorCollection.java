package com.example.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DICollectionConstructor.xml");
        Question q=(Question)context.getBean("e");
        q.displayInfo();
    }
}
