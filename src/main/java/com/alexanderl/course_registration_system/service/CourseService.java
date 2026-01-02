package com.alexanderl.course_registration_system.service;

import com.alexanderl.course_registration_system.entity.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);

    Course getCourseById(Long id);

    List<Course> getAllCourses();

    Course updateCourse(Long id, Course updatedCourse);

    void deleteCourse(Long id);
}
