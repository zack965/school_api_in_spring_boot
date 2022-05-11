package com.school.school.Models;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_course_material")
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_material_id",length = 40)
    private Long CourseMateriald;
    @Column(name = "course_material_url",length = 140)
    private String CourseMaterialUrl;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "course_id"
    )
    private Course course;
}
