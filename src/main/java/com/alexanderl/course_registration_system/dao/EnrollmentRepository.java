package com.alexanderl.course_registration_system.dao;

import com.alexanderl.course_registration_system.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
