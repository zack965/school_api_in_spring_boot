package com.school.school.Controllers;


import com.school.school.Models.Course;
import com.school.school.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    private CourseServices courseServices;
    //@RequestMapping(value = "/course/GetAllCourses",method = RequestMethod.GET)
    @GetMapping("/course/GetAllCourses")
    public String GetAllCourses(){
        return "hello world";
    }
    @PostMapping("createCourse")
    public Course CreateCourse(@RequestBody Course course){
        return courseServices.CreateCourse(course);
    }
}
