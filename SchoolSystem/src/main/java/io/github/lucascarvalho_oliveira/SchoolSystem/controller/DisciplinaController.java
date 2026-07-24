package io.github.lucascarvalho_oliveira.SchoolSystem.controller;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Disciplina;
import io.github.lucascarvalho_oliveira.SchoolSystem.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("disciplina")
public class DisciplinaController {

    private DisciplinaService serviceDisciplina;

    public DisciplinaController(DisciplinaService serviceDisciplina){
        this.serviceDisciplina = serviceDisciplina;
    }

    @PostMapping
    public Disciplina salvarDisciplina(@RequestBody Disciplina disciplina){
        Disciplina disciplinaSalva = serviceDisciplina.salvarDisciplina(disciplina);
        return disciplinaSalva;
    }

    @GetMapping("{nome}")
    public List<Disciplina> listDisciplina(@PathVariable String nome){
        return serviceDisciplina.listaDisciplina(nome);
    }
}
