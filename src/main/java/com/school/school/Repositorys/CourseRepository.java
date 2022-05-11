package com.school.school.Repositorys;

import com.school.school.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Long> {
}
