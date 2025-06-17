package com.pluralsight.restforthewicked.school;

/**
 * Class which represents a student.  This is called a DTO, or entity.
 * It basically represents a "row" in the students table.
 */
public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student named: " + this.getName();
    }
}
