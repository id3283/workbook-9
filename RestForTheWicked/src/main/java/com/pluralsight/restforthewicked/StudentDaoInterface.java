package com.pluralsight.restforthewicked;

import java.util.List;

public interface StudentDaoInterface {
    List<Student> getStudents();

    void addStudent(Student student);
}
