package com.example.demo;

import com.example.setter.Employee1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestWithApplicationContext {
        public static void main(String[] args) {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("ApplicationContextSetterInjection.xml");
            Employee s=(Employee)context.getBean("e");
            s.show();

        }
    }


