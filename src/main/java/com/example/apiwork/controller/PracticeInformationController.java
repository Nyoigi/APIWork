package com.example.apiwork.controller;

import com.example.apiwork.model.newBd.Group;
import com.example.apiwork.model.newBd.Practice;
import com.example.apiwork.model.newBd.PracticeInformation;
import com.example.apiwork.repository.GroupRepository;
import com.example.apiwork.repository.newBD.PracticeInformationRepository;
import com.example.apiwork.repository.newBD.PracticeRepository;
import io.swagger.annotations.Api;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер API, который отвечает за просмотр информации о студентах, определенных на практику
 */
@RestController
@RequestMapping("/api")
@Api(value = "ApiWork", tags = "ApiWork")
public class PracticeInformationController {

    @Autowired
    private final PracticeInformationRepository practiceInformationRepository;

    @Autowired
    private final PracticeRepository practiceRepository;
    @Autowired
    private final GroupRepository groupRepository;

    public PracticeInformationController(PracticeInformationRepository practiceInformationRepository, PracticeRepository practiceRepository, GroupRepository groupRepository) {
        this.practiceInformationRepository = practiceInformationRepository;
        this.practiceRepository = practiceRepository;
        this.groupRepository = groupRepository;
    }

    @GetMapping("/PRInfo")
    public ResponseEntity<List<PracticeInformation>> getAllStudents() {
        List<PracticeInformation> students = (List<PracticeInformation>) practiceInformationRepository.findAll();
        for (PracticeInformation practiceInformation : students) {
            Hibernate.initialize(practiceInformation.getPractice());
            Hibernate.initialize(practiceInformation.getStudent());
            Hibernate.initialize(practiceInformation.getEmployee());
            Hibernate.initialize(practiceInformation.getHeadOrganization());
        }
        return ResponseEntity.ok(students);
    }

    @GetMapping("/PRInfo/{practiceInfoId}")
    public ResponseEntity<PracticeInformation> getPrInfoId(@PathVariable Long practiceInfoId) {
        PracticeInformation practiceInformation = practiceInformationRepository.findById(practiceInfoId).orElseThrow();
        if (practiceInformation != null) {
            return ResponseEntity.ok(practiceInformation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/Practice")
    public ResponseEntity<List<Practice>> getAllPractices() {
        List<Practice> students = (List<Practice>) practiceRepository.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/Practice/{practiceInfoId}")
    public ResponseEntity<Practice> getPrId(@PathVariable Long practiceInfoId) {
        Practice practiceInformation = practiceRepository.findById(practiceInfoId).orElseThrow();
        if (practiceInformation != null) {
            return ResponseEntity.ok(practiceInformation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Group")
    public ResponseEntity<List<Group>> getAllGroups() {
        List<Group> students = (List<Group>) groupRepository.findAll();
        return ResponseEntity.ok(students);
    }
}
