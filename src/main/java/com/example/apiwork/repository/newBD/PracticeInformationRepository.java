package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.Employee;
import com.example.MPTSait.model.newBd.PracticeInformation;
import com.example.MPTSait.model.newBd.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PracticeInformationRepository extends CrudRepository<PracticeInformation, Long> {
    PracticeInformation findByEmployee(Employee employee);

   // List<PracticeInformation> findPracticeInformationByStudent (List<Student> students);

}
