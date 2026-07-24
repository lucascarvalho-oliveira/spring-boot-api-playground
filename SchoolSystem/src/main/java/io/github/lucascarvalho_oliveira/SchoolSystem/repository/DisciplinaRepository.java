package io.github.lucascarvalho_oliveira.SchoolSystem.repository;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    List<Disciplina> findAllByNome(String nome);
}
