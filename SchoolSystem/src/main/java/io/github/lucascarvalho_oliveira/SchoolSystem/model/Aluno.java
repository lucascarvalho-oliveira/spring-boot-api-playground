package io.github.lucascarvalho_oliveira.SchoolSystem.model;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.enums.TipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Aluno extends Pessoa{

    @ManyToMany
    @JoinTable(
            name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    protected Aluno(){}

    public Aluno (String nome, String telefone, LocalDate dataNacimento, Disciplina disciplina){
        super(nome, telefone, dataNacimento, TipoPessoa.ALUNO);

        this.disciplinas = new ArrayList<>();
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
