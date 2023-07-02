package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.BasePractice;
import com.example.apiwork.model.newBd.HeadOrganization;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HeadOrganizationRepository extends CrudRepository<HeadOrganization, Long> {
    List<HeadOrganization> findAllByBasePractice(BasePractice basePractice);
    HeadOrganization deleteAllByBasePractice(BasePractice basePractice);
}
