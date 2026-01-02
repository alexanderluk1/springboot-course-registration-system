package com.alexanderl.course_registration_system.service;

import com.alexanderl.course_registration_system.entity.Enrollment;

import java.util.List;

public interface EnrollmentService {
    Enrollment enrollStudent(Long studentId, Long courseId);

    List<Enrollment> getEnrollmentsByStudentId(Long studentId);

    List<Enrollment> getEnrollmentsByCourseId(Long courseId);

    void dropEnrollment(Long enrollmentId);
}
