package com.school.school.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "tb_teatchers")
public class Teatcher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teatcher_id")
    private Long teatcherId;
    @Column(name = "teatcher_first_name",nullable = false,length = 50)
    private String firstName;
    @Column(name = "teatcher_last_name",nullable = false,length = 50)
    private String lastName;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy  = "teatcher"
    )

    private List<Course> courses;
}
