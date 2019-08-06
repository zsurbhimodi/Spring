package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithObjectAutoWire {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DIObjectConstructorAutowire.xml");
        EmployeeAddress s=(EmployeeAddress)context.getBean("e");
        s.show();

    }
}
