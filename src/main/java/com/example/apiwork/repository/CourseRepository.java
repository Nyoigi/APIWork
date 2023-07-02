package com.example.apiwork.repository;

import com.example.apiwork.model.newBd.Course;
import com.example.apiwork.model.newBd.Specialization;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findCourseByNameCourseAndSpecialization(String nameCourse, Specialization specialization);

    Course findCourseBySpecialization(Long specialization);

    Course findCourseBySpecializationAndAndNameCourse(Specialization spec, String nameCourse);
}
