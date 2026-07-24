package io.github.lucascarvalho_oliveira.SchoolSystem.service;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Disciplina;
import io.github.lucascarvalho_oliveira.SchoolSystem.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    private final DisciplinaRepository repositoryDisciplina;

    public DisciplinaService(DisciplinaRepository repositoryDisciplina){
        this.repositoryDisciplina = repositoryDisciplina;
    }

    public Disciplina salvarDisciplina(Disciplina disciplina){
        return repositoryDisciplina.save(disciplina);
    }

    public List<Disciplina> listaDisciplina(String nome){
        return repositoryDisciplina.findAllByNome(nome);
    }

}
