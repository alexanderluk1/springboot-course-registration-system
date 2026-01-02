package com.alexanderl.course_registration_system.service.impl;

import com.alexanderl.course_registration_system.dao.*;
import com.alexanderl.course_registration_system.entity.Student;
import com.alexanderl.course_registration_system.enums.StudentStatus;
import com.alexanderl.course_registration_system.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;
    EnrollmentRepository enrollmentRepository;

    public StudentServiceImpl(StudentRepository studentRepository, EnrollmentRepository enrollmentRepository) {
        this.studentRepository = studentRepository;
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        student.setStatus(StudentStatus.ACTIVE);
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existing.setName(student.getName());
        existing.setEmail(student.getEmail());

        return studentRepository.save(existing);
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // TODO: Check enrollmentRepo if student exist to handle delete

//        studentRepository.delete(existing);
    }
}
