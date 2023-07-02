package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.Specialization;
import org.springframework.data.repository.CrudRepository;

public interface SpecializationRepository extends CrudRepository<Specialization, Long> {

    Specialization searchSpecializationsByNumberSpec(String numberSpec);
}
