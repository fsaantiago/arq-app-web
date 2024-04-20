package com.newton.trabalho.apifipe.controller;

import com.newton.trabalho.apifipe.entity.CarData;
import com.newton.trabalho.apifipe.service.CarDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarDataController {

    private CarDataRepository carDataRepository;

    //http://localhost:8080/modelos/marcas/
    @GetMapping("/modelos/{marca}")
    public ResponseEntity<List<String>> getModels(@PathVariable int marca) {
        List<String> modelos = carDataRepository.findModelsByMarca(marca);
        return ResponseEntity.ok(modelos);
    }
    //http://localhost:8080/anos/marcas/modelos/
    @GetMapping("/anos/{marca}/{modelo}")
    public ResponseEntity<List<Integer>> getAge(@PathVariable int marca, @PathVariable int modelo) {
        List<Integer> anos = carDataRepository.findAnosByMarcaAndModelo(marca, modelo);
        return ResponseEntity.ok(anos);
    }
    //http://localhost:8080/valor/marcas/modelos/anos
    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public ResponseEntity<String> getValue(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
        Optional<CarData> carData = carDataRepository.findByMarcaAndModeloAndAno(marca, modelo, ano);
        return carData.map(data -> ResponseEntity.ok("Valor do carro: " + data.getValor())).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //http://localhost:8080/cars/add
    @PostMapping("/cars/add")
    public ResponseEntity<String> createCar(@RequestBody CarData carData) {
        // Verifica se o valor do carro foi fornecido
        if (carData.getValor() <= 0) {
            return ResponseEntity.badRequest().body("O valor do carro é obrigatório e deve ser maior que zero");
        }

        carDataRepository.save(carData);
        return ResponseEntity.ok("Carro criado com sucesso");
    }

    //http://localhost:8080/cars/id
    @GetMapping("/cars/{id}")
    public ResponseEntity<CarData> consultCar(@PathVariable String id) {
        Optional<CarData> carData = carDataRepository.findById(id);
        return carData.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    //http://localhost:8080/cars/id
    @PutMapping("/cars/{id}")
    public ResponseEntity<String> updateCar(@PathVariable String id, @RequestBody CarData updatedCarData) {
        Optional<CarData> existingCarData = carDataRepository.findById(id);
        if (existingCarData.isPresent()) {
            updatedCarData.setId(id);
            carDataRepository.save(updatedCarData);
            return ResponseEntity.ok("Carro atualizado com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //http://localhost:8080/cars/id
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable String id) {
        Optional<CarData> existingCarData = carDataRepository.findById(id);
        if (existingCarData.isPresent()) {
            carDataRepository.deleteById(id);
            return ResponseEntity.ok("Carro apagado com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}