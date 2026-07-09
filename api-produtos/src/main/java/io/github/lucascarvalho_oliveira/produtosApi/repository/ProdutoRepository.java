package io.github.lucascarvalho_oliveira.produtosApi.repository;

import io.github.lucascarvalho_oliveira.produtosApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNome(String nome);
}
