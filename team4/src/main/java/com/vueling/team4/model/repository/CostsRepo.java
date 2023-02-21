package com.vueling.team4.model.repository;

import com.vueling.team4.model.domain.Costs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CostsRepo extends MongoRepository<Costs,String> {
}
