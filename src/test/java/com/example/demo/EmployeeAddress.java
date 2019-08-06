package com.example.demo;

public class EmployeeAddress {

    private int id;
    private String name;
    private Address address;//Aggregation

    public EmployeeAddress() {System.out.println("def cons");}

    public EmployeeAddress(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println(address.toString());
    }
}
