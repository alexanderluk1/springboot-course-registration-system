package com.alexanderl.course_registration_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="student_number")
    private String studentNumber;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email
}
