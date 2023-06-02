package com.example.MPTSait.repository.newBD;


import com.example.MPTSait.model.newBd.Group;
import com.example.MPTSait.model.newBd.Student;
import jakarta.validation.constraints.NotEmpty;
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
