package com.alexanderl.course_registration_system.controller;

import com.alexanderl.course_registration_system.entity.Student;
import com.alexanderl.course_registration_system.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
