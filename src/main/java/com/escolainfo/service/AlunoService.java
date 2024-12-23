package com.escolainfo.service;

import com.escolainfo.model.Aluno;
import com.escolainfo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}





