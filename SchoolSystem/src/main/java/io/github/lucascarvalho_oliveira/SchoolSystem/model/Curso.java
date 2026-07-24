package io.github.lucascarvalho_oliveira.SchoolSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotBlank
    private String nomeCurso;

    @NotBlank
    private String planoEnsino;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas;

    @ManyToMany(mappedBy = "cursos")
    private List<Professor> professores;

    protected Curso(){}

    public Curso(String nomeCurso, String planoEnsino) {
        this.nomeCurso = nomeCurso;
        this.planoEnsino = planoEnsino;

        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getPlanoEnsino() {
        return planoEnsino;
    }

    public void setPlanoEnsino(String planoEnsino) {
        this.planoEnsino = planoEnsino;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
