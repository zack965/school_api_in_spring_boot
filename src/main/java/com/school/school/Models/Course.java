package com.school.school.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long CourseId;
    @Column(name = "Course_Name",nullable = false,unique = true,length = 40)
    private String CourseName;



    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    @ManyToOne
    @JoinColumn(name = "teather_id",
            referencedColumnName = "teatcher_id",
            nullable = false

    )
    private Teatcher teatcher;


}
