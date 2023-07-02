package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.Employee;
import com.example.apiwork.model.newBd.PracticeInformation;
import org.springframework.data.repository.CrudRepository;

public interface PracticeInformationRepository extends CrudRepository<PracticeInformation, Long> {
    PracticeInformation findByEmployee(Employee employee);

   // List<PracticeInformation> findPracticeInformationByStudent (List<Student> students);

}
