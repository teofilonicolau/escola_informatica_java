package com.escolainfo.model;



import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String codigoMatricula;

    @NotNull
    private LocalDate dataMatricula;

    @NotNull
    private String nome;

    @NotNull
    private String endereco;

    @NotNull
    private String telefone;

    @NotNull
    private LocalDate dataNascimento;

    private double altura;
    private double peso;
}
