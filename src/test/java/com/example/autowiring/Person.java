package com.example.autowiring;

public class Person {

    public String getName() {
        return name;
    }

    public Person(String name, String address, String age) {
        this.name = name;
        Address = address;
        Age = age;
    }


    public void display() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Age='" + Age + '\'' +
                '}');;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    private String name;
    private String Address;
    private String Age;

}
