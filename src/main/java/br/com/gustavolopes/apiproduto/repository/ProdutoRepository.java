package br.com.gustavolopes.apiproduto.repository;


import br.com.gustavolopes.apiproduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
