package com.alexanderl.course_registration_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private long id;

    @Column(name="course_code", nullable = false)
    private String courseCode;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="credits", nullable = false)
    private int credits;

    public Course() {}

    public Course(String courseCode, String title, String description, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.credits = credits;
    }

    public long getId() {
        return id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseCode='" + courseCode + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", credits=" + credits +
                '}';
    }
}
