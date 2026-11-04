package com.example.javawebservice_session5.repository;

import com.example.javawebservice_session5.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Spring Data JPA đã tích hợp sẵn các hàm save, findAll, findById, deleteById,...
}