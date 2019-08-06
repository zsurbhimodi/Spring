package com.example.autowiring;

import com.example.demo.EmployeeAddress;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithAutoWiringAnnotation {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DIObjectConstructorAutowireAnnotation.xml");
        Customer s=(Customer)context.getBean("CustomerBean");
        System.out.println(s);



    }
}
