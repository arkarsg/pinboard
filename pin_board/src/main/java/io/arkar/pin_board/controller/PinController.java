package io.arkar.pin_board.controller;

import io.arkar.pin_board.model.Pin;
import io.arkar.pin_board.repository.PinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * PinController is in charge of handling incoming endpoint requests and
 * responding to them.
 * Deals with REST API queries relating to our Pin model.
 */

// Informs Spring that this class will handle REST requests
@RestController
// Configure CORS, access to our API endpoints
@CrossOrigin
// Defines the URL path to which our endpoint request will be mapped
@RequestMapping("/pins")
public class PinController {
    // `Autowired` is used to inject dependencies into the class
    @Autowired
    private PinRepository pinRepository;

    @PostMapping("/create")
    public Pin create(@RequestBody Pin pin) {
        return pinRepository.save(pin);
    }

    @GetMapping("/all")
    public List<Pin> getAllPins() {
        return pinRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pin> findOneById(@PathVariable String id) {
        return pinRepository.findById(id);
    }

    @PutMapping("/update")
    public Pin update(@RequestBody Pin pin) {
        return pinRepository.save(pin);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        pinRepository.deleteById(id);
    }
}
