package com.pluralsight.restforthewicked;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    SimpleStudentDao dao;

    @Autowired
    public StudentService(SimpleStudentDao dao) {
        this.dao = dao;
    }

    public void addStudent(String name) {
        Student newGuy = new Student(name);
        this.dao.addStudent(newGuy);
    }
}
