package io.github.lucascarvalho_oliveira.SchoolSystem.controller;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Curso;
import io.github.lucascarvalho_oliveira.SchoolSystem.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("curso")
public class CursoController {

    private CursoService serviceCurso;

    public CursoController(CursoService serviceCurso){
        this.serviceCurso = serviceCurso;
    }

    @PostMapping
    public Curso salvarCurso(@RequestBody Curso curso){
        Curso cursoSalvo = serviceCurso.salvarCurso(curso);
        return cursoSalvo;
    }

    @GetMapping
    public List<Curso> listaCurso(){
        return serviceCurso.listarCurso();
    }

    @DeleteMapping("{id}")
    public void deletarCurso(@PathVariable Integer id){
        serviceCurso.deletarCurso(id);
    }
}
