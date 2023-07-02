package com.example.apiwork.controller;

import com.example.apiwork.model.newBd.BasePractice;
import com.example.apiwork.repository.newBD.BasePracticeRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер API, который отвечает за просмотр информации о базах практики
 */
@RestController
@RequestMapping("/api")
@Api(value = "ApiWork", tags = "ApiWork")
public class BasePracticeController {

    @Autowired
    private final BasePracticeRepository basePracticeRepository;

    public BasePracticeController(BasePracticeRepository basePracticeRepository) {
        this.basePracticeRepository = basePracticeRepository;
    }

//    @GetMapping("/BasePractice")
//    @ApiOperation(value = "Get all Accounts")
//    public List<BasePractice> getAllBase() {
//        return (List<BasePractice>) basePracticeRepository.findAll();
//    }

    @GetMapping("/BasePractice")
    public ResponseEntity<List<BasePractice>> getAllStudents() {
        List<BasePractice> students = (List<BasePractice>) basePracticeRepository.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/BasePractice/{baseId}")
    public ResponseEntity<BasePractice> getBaseId(@PathVariable Long baseId) {
        BasePractice basePractice = basePracticeRepository.findById(baseId).orElseThrow();
        if (basePractice != null) {
            return ResponseEntity.ok(basePractice);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
