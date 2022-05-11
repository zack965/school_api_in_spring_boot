package com.school.school.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_students",
    uniqueConstraints = @UniqueConstraint(
            name = "email_unique",
            columnNames = "student_email"
    )
)
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long StudentId;
    @Column(name = "student_name",nullable = false,length = 50)
    private String studentName;
    @Column(name = "student_email",nullable = true,length = 50)
    private String studentEmail;
    @Column(name = "student_age",nullable = false,length = 20)
    private int studentAge;
}
