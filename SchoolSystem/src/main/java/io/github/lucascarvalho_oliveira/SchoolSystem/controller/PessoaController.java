package io.github.lucascarvalho_oliveira.SchoolSystem.controller;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Aluno;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.Pessoa;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.Professor;
import io.github.lucascarvalho_oliveira.SchoolSystem.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    private PessoaService servicePessoa;

    public PessoaController(PessoaService servicePessoa){
        this.servicePessoa = servicePessoa;
    }

    @PostMapping("aluno")
    public Aluno salvarPessoa(@RequestBody Aluno aluno){
        Aluno alunoSalvo = servicePessoa.salvarAluno(aluno);
        return alunoSalvo;
    }

    @PostMapping("professor")
    public Professor salvarProfessor(@RequestBody Professor professor){
        Professor professorSalvo = servicePessoa.salvarProfessor(professor);
        return professorSalvo;
    }

    @GetMapping("alunos")
    public List<Pessoa> listaAluno(){
        return servicePessoa.ListaAluno();
    }

    @GetMapping("professores")
    public List<Pessoa> listaProfessor(){
        return servicePessoa.ListaProfessor();
    }
}
