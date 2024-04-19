package com.newton.apiclima.controller;

import com.newton.apiclima.entity.*;
import com.newton.apiclima.service.ClimaRepository;
import com.newton.apiclima.entity.ClimaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clima")
public class ClimaController {

    @Autowired
    private ClimaRepository climaRepository;

    @PostMapping("/add")
    public ClimaData adicionarClima(@RequestBody ClimaData clima) {
        return climaRepository.save(clima);
    }

    @GetMapping("/list")
    public List<ClimaData> listarClima() {
        return climaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ClimaData getClimaById(@PathVariable String id) {
        return climaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ClimaData atualizarClima(@PathVariable String idClima, @RequestBody ClimaData clima) {
        clima.setIdClima(Integer.parseInt(idClima));
        return climaRepository.save(clima);
    }

    @DeleteMapping("/{id}")
    public void deletarClima(@PathVariable String id) {
        climaRepository.deleteById(id);
    }
}