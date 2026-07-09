package io.github.lucascarvalho_oliveira.produtosApi.controller;

import io.github.lucascarvalho_oliveira.produtosApi.model.Produto;
import io.github.lucascarvalho_oliveira.produtosApi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository repositoryProduto;

    public ProdutoController(ProdutoRepository repositoryProduto) {
        this.repositoryProduto = repositoryProduto;
    }

    @PostMapping
    public void salvarProduto(@RequestBody Produto produto){
        repositoryProduto.save(produto);
    }

    @GetMapping("{id}")
    public Produto buscarProduto(@PathVariable("id") int id){
        return repositoryProduto.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    @DeleteMapping("{id}")
    public void deleteProduto(@PathVariable("id") int id){
        repositoryProduto.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizarProduto(@PathVariable("id") int id, @RequestBody Produto produto){
        produto.setId(id);
        repositoryProduto.save(produto);
    }

    @GetMapping
    public List<Produto> buscarPorNome(@RequestParam("nome") String nome){
        return repositoryProduto.findByNome(nome);
    }
}
