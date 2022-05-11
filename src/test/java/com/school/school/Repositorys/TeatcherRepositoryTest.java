package com.school.school.Repositorys;

import com.school.school.Models.Course;
import com.school.school.Models.Teatcher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
class TeatcherRepositoryTest {
    @Autowired
    private TeatcherRepository teatcherRepository;

    @Test
    public void SaveTeatcher(){
        Course course = Course.builder()
                .CourseName("havana")
                .build();
        Teatcher teatcher = Teatcher.builder()
                .firstName("ahmad")
                .lastName("rajawi")
                .courses(List.of(course))
                .build();
        teatcherRepository.save(teatcher);
    }
    @Test
    public void findAllPagination(){
        Pageable firstPageWithTwoElements = PageRequest.of(0, 2);

        List<Teatcher> teatchers = teatcherRepository.findAll(firstPageWithTwoElements).getContent();
        System.out.println("teatchers = " + teatchers);
    }
} 