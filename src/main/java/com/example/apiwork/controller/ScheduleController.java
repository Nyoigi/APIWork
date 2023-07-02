package com.example.apiwork.controller;

import com.example.apiwork.model.newBd.BasePractice;
import com.example.apiwork.model.newBd.Schedule;
import com.example.apiwork.repository.newBD.ScheduleRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Контроллер API, который отвечает за просмотр информации о расписании
 */
@RestController
@RequestMapping("/api")
@Api(value = "ApiWork", tags = "ApiWork")
public class ScheduleController {

    @Autowired
    private final ScheduleRepository scheduleRepository;


    public ScheduleController(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @GetMapping("/Schedule")
    public ResponseEntity<List<Schedule>> getAllStudents() {
        List<Schedule> students = (List<Schedule>) scheduleRepository.findAll();

        return ResponseEntity.ok(students);
    }

    @GetMapping("/Schedule/{scheduleId}")
    public ResponseEntity<Schedule> getScheduleId(@PathVariable Long scheduleId) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow();
        if (schedule != null) {
            return ResponseEntity.ok(schedule);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
