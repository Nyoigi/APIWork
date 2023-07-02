package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.BasePractice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BasePracticeRepository extends CrudRepository<BasePractice, Long> {
//    BasePractice findBasePracticeByNameOrganization(String nameBase);

    List<BasePractice> findBasePracticeByNameOrganization(String nameBase);
}
