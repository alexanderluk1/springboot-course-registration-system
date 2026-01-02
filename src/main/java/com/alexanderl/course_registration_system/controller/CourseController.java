package com.alexanderl.course_registration_system.controller;

import com.alexanderl.course_registration_system.entity.Course;
import com.alexanderl.course_registration_system.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }
}
