package com.alexanderl.course_registration_system.dao;

import com.alexanderl.course_registration_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    boolean existsByEmail(Student student);
}
