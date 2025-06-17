package com.pluralsight.restforthewicked.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
//
//@Component
//public class StudentRunner implements CommandLineRunner {
//    StudentDaoInterface dao;
//
//    @Autowired
//    public StudentRunner(StudentDaoInterface dao) {
//        this.dao = dao;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Get all the students and print them
//        List<Student> students = dao.getStudents();
//        printStudents(students);
//
//        // Add a new student
//        Student newGuy = new Student("Eckbert");
//        dao.addStudent(newGuy);
//        System.out.println("\nAdded: " + newGuy + "\n");
//
//        // Let's list them again to see if the new guy is there.
//        students = dao.getStudents();
//        printStudents(students);
//    }
//
//    private static void printStudents(List<Student> students) {
//        System.out.println("Here are all the students:");
//        for (Student student: students)
//            System.out.println("\t" + student);
//    }
//}
