package com.example.api.controller;

import com.example.api.repository.DataItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DataController {

    private final DataItemRepository dataItemRepository;

    public DataController(DataItemRepository dataItemRepository) {
        this.dataItemRepository = dataItemRepository;
    }

    @GetMapping("/data")
    public DataResultDTO getData() {
        return new DataResultDTO(dataItemRepository.findAll());
    }

    @PostMapping("/data")
    public DataResultDTO saveData() {
        return null;
    }
}