package io.github.lucascarvalho_oliveira.SchoolSystem.repository;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.Pessoa;
import io.github.lucascarvalho_oliveira.SchoolSystem.model.enums.TipoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    List<Pessoa> findAllByTipoPessoa(TipoPessoa tipoPessoa);
}
