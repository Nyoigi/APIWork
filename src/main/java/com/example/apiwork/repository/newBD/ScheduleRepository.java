package com.example.apiwork.repository.newBD;

import com.example.apiwork.model.newBd.Practice;
import com.example.apiwork.model.newBd.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    Schedule findByPractice(Practice practice);
}
