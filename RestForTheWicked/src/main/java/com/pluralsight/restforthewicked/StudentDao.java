package com.pluralsight.restforthewicked;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class StudentDao {
    List<Student> fakeDatabase = new ArrayList<>();

    public StudentDao() {
        this.fakeDatabase.add(new Student("Mike"));
        this.fakeDatabase.add(new Student("Izel"));
        this.fakeDatabase.add(new Student("Mahlet"));
        this.fakeDatabase.add(new Student("Victoria"));
    }

    public List<Student> getStudents() {
        return this.fakeDatabase;
    }

    public void addStudent(Student student) {
        this.fakeDatabase.add(student);
    }
}
