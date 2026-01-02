package com.alexanderl.course_registration_system.service.impl;

import com.alexanderl.course_registration_system.dao.CourseRepository;
import com.alexanderl.course_registration_system.entity.Course;
import com.alexanderl.course_registration_system.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course createCourse(Course course) {
        if (courseRepository.existsByCourseCode(course.getCourseCode())) throw new RuntimeException("Course code already exists");

        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getReferenceById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course updateCourse(Long id, Course updatedCourse) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }
}
