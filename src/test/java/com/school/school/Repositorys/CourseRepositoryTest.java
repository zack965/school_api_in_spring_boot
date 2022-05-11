package com.school.school.Repositorys;

import com.school.school.Models.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Test
    public void PrintAllCourses(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("courseList = " + courseList);
    }
}