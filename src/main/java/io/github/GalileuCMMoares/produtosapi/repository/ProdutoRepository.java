package io.github.GalileuCMMoares.produtosapi.repository;

import io.github.GalileuCMMoares.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
