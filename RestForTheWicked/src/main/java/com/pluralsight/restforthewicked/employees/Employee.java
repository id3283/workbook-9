package com.pluralsight.restforthewicked.employees;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
