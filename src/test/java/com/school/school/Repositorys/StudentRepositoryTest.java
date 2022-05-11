package com.school.school.Repositorys;

import com.school.school.Models.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void SaveStudent() {
        Student student = Student.builder()
                .studentAge(22)
                .studentName("zack")
                .studentEmail("Zack@gmail.com")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void PrintAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void PrintStudentByAge() {
        List<Student> students = studentRepository.findStudentByStudentAge(22);
        System.out.println("students = " + students);
    }

    @Test
    public void PrintStudentByName() {
        List<Student> students = studentRepository.findStudentsByStudentNameContaining("m");
        System.out.println("students = " + students);
    }
    @Test
    public void GetStudentsWhoStartWithA(){
        List<Student> students = studentRepository.findStudentsByStudentNameStartingWith("n");
        System.out.println("students = " + students);
    }
    @Test
    public void GetStudentByEmail(){
        List<Student> students = studentRepository.GetStudentsBYEmail("Zack@gmail.com");
        System.out.println("students = " + students);
    }
    @Test
    public void PrintGetStudentNameByEmail(){
        String student_name = studentRepository.GetStudentNameByEmail("Zack@gmail.com");
        System.out.println("student = " + student_name);
    }
    @Test
    public void PrintGetStudentNameByEmailWithNamedParams(){
        String student_name = studentRepository.GetStudentNameByEmailWithNamedParams("Zack@gmail.com");
        System.out.println("student = " + student_name);
    }
    @Test
    public void UpdateStudentNameBaseOnId(){
        studentRepository.UpdateStudentNameBaseOnId("zakaria",1);
    }

}