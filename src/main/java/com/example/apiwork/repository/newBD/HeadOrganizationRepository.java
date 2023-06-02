package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.BasePractice;
import com.example.MPTSait.model.newBd.HeadOrganization;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HeadOrganizationRepository extends CrudRepository<HeadOrganization, Long> {
    List<HeadOrganization> findAllByBasePractice(BasePractice basePractice);
    HeadOrganization deleteAllByBasePractice(BasePractice basePractice);
}
