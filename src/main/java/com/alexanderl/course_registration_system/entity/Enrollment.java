package com.alexanderl.course_registration_system.entity;

import com.alexanderl.course_registration_system.enums.EnrollmentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private long id;

    @Column(name="student", nullable = false)
    private Student student;

    @Column(name="course", nullable = false)
    private Course course;

    @Column(name="enrolled_at", nullable = false)
    private LocalDateTime enrolledAt;

    @Column(name="enrollment_status", nullable = false)
    private EnrollmentStatus status;

    @Column(name="grade")
    private String grade;
}
