package io.github.lucascarvalho_oliveira.SchoolSystem.model;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.enums.TipoPessoa;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professor extends Pessoa{

    @ManyToMany
    @JoinTable(
            name = "professor_curso",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    protected Professor(){}

    public Professor(String nome, String telefone, LocalDate dataNacimento){
        super(nome, telefone, dataNacimento, TipoPessoa.PROFESSOR);

        this.cursos = new ArrayList<>();
    }

    public List<Curso> getCurso() {
        return cursos;
    }

    public void setCurso(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
