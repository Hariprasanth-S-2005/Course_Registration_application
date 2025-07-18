package com.example.CourseRegistrationSystemApplication.service;

import com.example.CourseRegistrationSystemApplication.model.Course;
import com.example.CourseRegistrationSystemApplication.model.CourseRegistry;
import com.example.CourseRegistrationSystemApplication.repository.CourseRegistryRepo;
import com.example.CourseRegistrationSystemApplication.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
