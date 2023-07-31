package com.example.gym.modules.application.rest.controllers;

import com.example.gym.modules.domain.entities.Trainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainer")
public class TrainerRecord {

    @PostMapping(path = "/save")
    public ResponseEntity<String> save(@RequestBody Trainer trainer) {
        return ResponseEntity.ok("save");
    }

    @PutMapping(path = "/update")
    public ResponseEntity<String> update(@RequestBody Trainer trainer) {
        return ResponseEntity.ok("update");
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<String> delete(@RequestBody Trainer trainer) {
        return ResponseEntity.ok("delete");
    }

    @GetMapping(path = "/get-trainer")
    public ResponseEntity<String> getTrainer(@RequestBody Trainer trainer) {
        return ResponseEntity.ok("get");
    }

    @GetMapping(path = "/get-all-trainers")
    public ResponseEntity<String> getAllTrainers(@RequestBody Trainer trainer) {
        return ResponseEntity.ok("get");
    }

}
