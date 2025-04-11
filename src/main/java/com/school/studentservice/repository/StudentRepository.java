package com.school.studentservice.repository;

import com.school.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
    List<Student> findByGenderIgnoreCase(String gender); // for gender filter
}
