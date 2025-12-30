package com.alexanderl.course_registration_system.service.impl;

import com.alexanderl.course_registration_system.dao.StudentRepository;
import com.alexanderl.course_registration_system.entity.Student;
import com.alexanderl.course_registration_system.enums.StudentStatus;
import com.alexanderl.course_registration_system.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        if (studentRepository.existsByEmail(student)) {
            throw new IllegalArgumentException("Email already exists");
        }
        student.setStatus(StudentStatus.ACTIVE);
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
