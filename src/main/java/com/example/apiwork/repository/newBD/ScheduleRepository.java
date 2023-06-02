package com.example.MPTSait.repository.newBD;

import com.example.MPTSait.model.newBd.Practice;
import com.example.MPTSait.model.newBd.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    Schedule findByPractice(Practice practice);
}
