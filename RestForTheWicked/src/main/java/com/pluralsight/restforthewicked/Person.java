package com.pluralsight.restforthewicked;

public class Person {
    String title;
    String name;

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Person() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
