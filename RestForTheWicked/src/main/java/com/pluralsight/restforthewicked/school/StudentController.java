package com.pluralsight.restforthewicked.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    SimpleStudentDao studentDao;

    @Autowired
    public StudentController(SimpleStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return this.studentDao.getStudents();
    }
    
    

}
