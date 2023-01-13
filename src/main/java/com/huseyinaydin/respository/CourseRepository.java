package com.huseyinaydin.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.entity.Course;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByFeeLessThan(double fee);
}
