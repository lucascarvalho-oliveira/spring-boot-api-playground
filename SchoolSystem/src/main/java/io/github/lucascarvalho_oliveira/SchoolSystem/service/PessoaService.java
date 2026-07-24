package io.github.lucascarvalho_oliveira.SchoolSystem.service;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Aluno;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.Pessoa;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.Professor;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.enums.TipoPessoa;
import io.github.lucascarvalho_oliveira.SchoolSystem.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repositoryPessoa;

    public PessoaService(PessoaRepository repositoryPessoa){
        this.repositoryPessoa = repositoryPessoa;
    }

    public Aluno salvarAluno(Aluno aluno){
        return repositoryPessoa.save(aluno);
    }

    public Professor salvarProfessor(Professor professor){
        return repositoryPessoa.save(professor);
    }

    public List<Pessoa> ListaAluno(){
        return repositoryPessoa.findAllByTipoPessoa(TipoPessoa.ALUNO);
    }

    public List<Pessoa> ListaProfessor(){
        return  repositoryPessoa.findAllByTipoPessoa(TipoPessoa.PROFESSOR);
    }
}
