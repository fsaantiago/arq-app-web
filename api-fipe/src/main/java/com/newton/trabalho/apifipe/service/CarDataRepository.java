package com.newton.trabalho.apifipe.service;

import com.newton.trabalho.apifipe.entity.CarData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarDataRepository extends MongoRepository<CarData, String> {

    List<String> findModelsByMarca(int marca);

    List<Integer> findAnosByMarcaAndModelo(int marca, int modelo);

    Optional<CarData> findByMarcaAndModeloAndAno(int marca, int modelo, String ano);
}
