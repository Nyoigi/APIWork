package com.example.apiwork.repository.newBD;


import com.example.apiwork.model.newBd.Group;
import com.example.apiwork.model.newBd.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findStudentByEmailStudent(String emailStudent);
    Student findStudentByNumberPhoneStudent(String phone);

    //Student findStudentByGroup(Long nameGroup);

    List<Student> findStudentByGroup(Group group);

    Student findStudentByIsAdd(Integer add);

    //List<Student> findByGroup(List<Group> groups);
}
