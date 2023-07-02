package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.Practice;
import org.springframework.data.repository.CrudRepository;

public interface PracticeRepository extends CrudRepository<Practice, Long> {

    Practice findByIdPractice(Long idPr);
}
