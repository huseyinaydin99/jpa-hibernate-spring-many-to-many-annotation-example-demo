package com.huseyinaydin.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findByNameContaining(String name);
}
