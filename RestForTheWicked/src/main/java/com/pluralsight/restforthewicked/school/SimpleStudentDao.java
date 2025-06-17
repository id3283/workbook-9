package com.pluralsight.restforthewicked.school;

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
        this.fakeDatabase.add(new Student("Melchi"));
        this.fakeDatabase.add(new Student("Maya"));
        this.fakeDatabase.add(new Student("Sean"));
        this.fakeDatabase.add(new Student("Siphathisile"));
        this.fakeDatabase.add(new Student("Lourie"));
        this.fakeDatabase.add(new Student("Million"));
        this.fakeDatabase.add(new Student("Sujan"));
        this.fakeDatabase.add(new Student("Mo"));
        this.fakeDatabase.add(new Student("Gio"));
        this.fakeDatabase.add(new Student("David"));
        this.fakeDatabase.add(new Student("Karyna"));
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
