package com.alexanderl.course_registration_system.service;

import com.alexanderl.course_registration_system.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
