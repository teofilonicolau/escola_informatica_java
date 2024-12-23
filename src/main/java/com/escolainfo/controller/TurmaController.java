package com.escolainfo.controller;


import com.escolainfo.model.Turma;
import com.escolainfo.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> getAllTurmas() {
        return turmaService.getAllTurmas();
    }

    @PostMapping
    public Turma createTurma(@Valid @RequestBody Turma turma) {
        return turmaService.createTurma(turma);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> getTurmaById(@PathVariable Long id) {
        Turma turma = turmaService.getTurmaById(id);
        if (turma == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(turma);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTurma(@PathVariable Long id) {
        turmaService.deleteTurma(id);
        return ResponseEntity.noContent().build();
    }
}
