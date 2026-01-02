package com.alexanderl.course_registration_system.service.impl;

import com.alexanderl.course_registration_system.dao.*;
import com.alexanderl.course_registration_system.entity.*;
import com.alexanderl.course_registration_system.service.EnrollmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    EnrollmentRepository enrollmentRepository;
    StudentRepository studentRepository;
    CourseRepository courseRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository, StudentRepository studentRepository, CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Enrollment enrollStudent(Long studentId, Long courseId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student ID not found"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course ID not found"));

        Enrollment newEnrollment = new Enrollment(student, course);
        return enrollmentRepository.save(newEnrollment);
    }

    @Override
    public List<Enrollment> getEnrollmentsByStudentId(Long studentId) {
        return List.of();
    }

    @Override
    public List<Enrollment> getEnrollmentsByCourseId(Long courseId) {
        return List.of();
    }

    @Override
    public void dropEnrollment(Long enrollmentId) {

    }
}
