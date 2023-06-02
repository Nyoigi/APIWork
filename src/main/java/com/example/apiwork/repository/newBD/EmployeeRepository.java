package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.Employee;
import com.example.MPTSait.model.newBd.PostHead;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findEmployeeByPostHead(PostHead postHead);

    Employee findEmployeeByEmail(String email);
    //Employee findEmployeeByLogin (String email);

    List<Employee> findEmployeeByNameEmployee (String email);
}
