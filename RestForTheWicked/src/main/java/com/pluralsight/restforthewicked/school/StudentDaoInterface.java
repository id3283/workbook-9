package com.pluralsight.restforthewicked.school;

import java.util.List;

/**
 * This interface provides an abstraction of the DAO.
 * Why would we want this?  This way, we can declare variables with this
 * interface, and swap in different emplementations.
 * What?
 * Well, we could use a "simple" DAO (with just a List<Student>) or
 * one from a proper database like MySQL... we can just swap them since
 * they both implement this interface.
 */
public interface StudentDaoInterface {
    List<Student> getStudents();

    void addStudent(Student student);
}
