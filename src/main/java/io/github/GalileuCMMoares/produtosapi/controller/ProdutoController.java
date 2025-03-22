package io.github.GalileuCMMoares.produtosapi.controller;

import io.github.GalileuCMMoares.produtosapi.model.Produto;
import io.github.GalileuCMMoares.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: "+produto);
        var id= UUID.randomUUID().toString();
        produto.setId(id);
        repository.save(produto);
        return produto;
    }
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable("id") String id) {
        return repository.findById(id).orElse(null);
    }

}
