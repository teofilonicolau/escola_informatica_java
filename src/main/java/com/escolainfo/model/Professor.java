package com.escolainfo.model;


import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String cpf;

    @NotNull
    private String nome;

    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    private String titulacao;

    @ElementCollection
    private List<String> telefones;

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;
}




