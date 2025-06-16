package com.pluralsight.restforthewicked;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SimpleStudentDao implements StudentDaoInterface {
    List<Student> fakeDatabase = new ArrayList<>();

    public SimpleStudentDao() {
        this.fakeDatabase.add(new Student("Mike"));
        this.fakeDatabase.add(new Student("Izel"));
        this.fakeDatabase.add(new Student("Mahlet"));
        this.fakeDatabase.add(new Student("Victoria"));
    }

    @Override
    public List<Student> getStudents() {
        return this.fakeDatabase;
    }

    @Override
    public void addStudent(Student student) {
        this.fakeDatabase.add(student);
    }
}
