package io.github.lucascarvalho_oliveira.SchoolSystem.service;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Curso;
import io.github.lucascarvalho_oliveira.SchoolSystem.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repositoryCurso;

    public CursoService(CursoRepository repositoryCurso){
        this.repositoryCurso = repositoryCurso;
    }

    public Curso salvarCurso(Curso curso){
        return repositoryCurso.save(curso);
    }

    public List<Curso> listarCurso(){
        return repositoryCurso.findAll();
    }

    public void deletarCurso(Integer id){
        repositoryCurso.deleteById(id);
    }
}
