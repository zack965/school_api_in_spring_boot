package com.school.school.Repositorys;

import com.school.school.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findStudentByStudentAge(int StudentAge);
    public List<Student> findStudentsByStudentNameContaining(String studentName);
    public List<Student> findStudentsByStudentNameStartingWith(String studentName);
    // JPQL query
    @Query("select s from Student s where s.studentEmail = ?1")
    public List<Student> GetStudentsBYEmail(String Email);
    //Native query
    @Query(
            value ="select  student_name from tb_students where student_email = ?1",
            nativeQuery = true
    )
    public String GetStudentNameByEmail(String StudentEmail);

    // Native query Named Param
    @Query(
            value ="select  student_name from tb_students where student_email = :StudentEmail",
            nativeQuery = true
    )
    public String GetStudentNameByEmailWithNamedParams(@Param("StudentEmail") String StudentEmail);


    @Modifying
    @Transactional
    @Query(
            value = "update tb_students set student_name = :student_new_name where student_id =:student_id",
            nativeQuery = true
    )
    int UpdateStudentNameBaseOnId(@Param("student_new_name") String student_new_name,@Param("student_id") int student_id);
}
