package com.example.obspringbootejercicio456.controller;

import com.example.obspringbootejercicio456.entities.Laptop;
import com.example.obspringbootejercicio456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops-postman")
    public Laptop create(@RequestBody Laptop laptop){return laptopRepository.save(laptop);}

    public void save(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public Optional<Laptop> findById(Long aLong) {
        return laptopRepository.findById(aLong);
    }

    public long count() {
        return laptopRepository.count();
    }
}
