package com.api.cars.controller;

import com.api.cars.dto.CarDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/cars")
public class CarController {

    @PostMapping
    public void addCar(@RequestBody CarDTO req) {
        System.out.println("Modelo: " + req.modelo());
        System.out.println("Fabricante: " + req.fabricante());
        System.out.println("Valor: " + req.valor());
    }
}
