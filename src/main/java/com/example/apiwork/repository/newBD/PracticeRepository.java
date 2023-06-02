package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.Practice;
import org.springframework.data.repository.CrudRepository;

public interface PracticeRepository extends CrudRepository<Practice, Long> {

    Practice findByIdPractice(Long idPr);
}
