package com.school.school.Repositorys;

import com.school.school.Models.Course;
import com.school.school.Models.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void SaveCourseMaterial(){
        Course course = Course.builder().CourseName("spring bott").build();
        CourseMaterial courseMaterial = CourseMaterial.builder().CourseMaterialUrl("http://hello").course(course).build();
        courseMaterialRepository.save(courseMaterial);
    }
    @Test
    public void PrintAllCoursesMaterial(){
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }

}