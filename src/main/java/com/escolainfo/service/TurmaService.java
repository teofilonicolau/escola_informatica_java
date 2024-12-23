package com.escolainfo.service;



import com.escolainfo.model.Turma;
import com.escolainfo.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public Turma createTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Turma getTurmaById(Long id) {
        return turmaRepository.findById(id).orElse(null);
    }

    public void deleteTurma(Long id) {
        turmaRepository.deleteById(id);
    }
}
