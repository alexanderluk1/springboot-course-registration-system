package com.alexanderl.course_registration_system.dao;

import com.alexanderl.course_registration_system.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existsByCourseCode(String courseCode);
}
