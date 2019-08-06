package com.example.setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContextSetterInjection.xml");

        Employee1 s=(Employee1)context.getBean("obj");
        s.display();

    }
}
