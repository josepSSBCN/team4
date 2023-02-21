package com.vueling.team4.model.repository;

import com.vueling.team4.model.domain.Shifts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShiftsRepo extends MongoRepository<Shifts,String> {
}
