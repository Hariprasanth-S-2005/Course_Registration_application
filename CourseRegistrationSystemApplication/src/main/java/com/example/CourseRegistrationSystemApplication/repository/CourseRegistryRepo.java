package com.example.CourseRegistrationSystemApplication.repository;

import com.example.CourseRegistrationSystemApplication.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}