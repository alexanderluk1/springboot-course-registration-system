package com.alexanderl.course_registration_system.entity;

import com.alexanderl.course_registration_system.enums.EnrollmentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

    @Column(name="enrolled_at", nullable = false)
    private LocalDateTime enrolledAt;

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus status;

    @Column(name="grade")
    private String grade;
}
