package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithObjectInjection {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DIObjectConstructor.xml");
        EmployeeAddress s=(EmployeeAddress)context.getBean("e");
        s.show();

    }
}
