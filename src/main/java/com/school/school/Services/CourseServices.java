package com.school.school.Services;

import com.school.school.Models.Course;
import com.school.school.Repositorys.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServices   {
    @Autowired
    private  CourseRepository courseRepository;
    public Course CreateCourse(Course course){
        return courseRepository.save(course);
    }
}
