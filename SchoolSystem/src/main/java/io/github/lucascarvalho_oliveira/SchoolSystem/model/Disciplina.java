package io.github.lucascarvalho_oliveira.SchoolSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @Positive
    private Double cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Aluno> alunos;

    protected Disciplina(){}

    public Disciplina(String nome, Double cargaHoria, Curso curso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoria;
        this.curso = curso;

        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
