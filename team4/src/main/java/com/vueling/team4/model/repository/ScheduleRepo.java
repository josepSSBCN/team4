package com.vueling.team4.model.repository;

import com.vueling.team4.model.domain.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepo extends MongoRepository<Schedule, String> {
}
