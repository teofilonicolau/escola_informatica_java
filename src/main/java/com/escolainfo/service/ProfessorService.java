package com.escolainfo.service;


import com.escolainfo.model.Professor;
import com.escolainfo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }

    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}


