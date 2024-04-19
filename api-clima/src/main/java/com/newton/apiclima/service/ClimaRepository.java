package com.newton.apiclima.service;

import com.newton.apiclima.entity.ClimaData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClimaRepository extends MongoRepository<ClimaData, String> {
}
