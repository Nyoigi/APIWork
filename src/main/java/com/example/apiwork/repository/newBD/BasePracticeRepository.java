package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.BasePractice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BasePracticeRepository extends CrudRepository<BasePractice, Long> {
//    BasePractice findBasePracticeByNameOrganization(String nameBase);

    List<BasePractice> findBasePracticeByNameOrganization(String nameBase);
}
