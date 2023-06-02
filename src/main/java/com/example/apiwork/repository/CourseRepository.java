package com.example.MPTSait.repository;

import com.example.MPTSait.model.newBd.Course;
import com.example.MPTSait.model.newBd.Specialization;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findCourseByNameCourseAndSpecialization(String nameCourse, Specialization specialization);

    Course findCourseBySpecialization(Long specialization);

    Course findCourseBySpecializationAndAndNameCourse(Specialization spec, String nameCourse);
}
