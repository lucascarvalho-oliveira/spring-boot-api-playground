package io.github.lucascarvalho_oliveira.SchoolSystem.repository;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
