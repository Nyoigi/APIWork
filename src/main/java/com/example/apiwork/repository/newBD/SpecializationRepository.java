package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.Specialization;
import org.springframework.data.repository.CrudRepository;

public interface SpecializationRepository extends CrudRepository<Specialization, Long> {

    Specialization searchSpecializationsByNumberSpec(String numberSpec);
}
