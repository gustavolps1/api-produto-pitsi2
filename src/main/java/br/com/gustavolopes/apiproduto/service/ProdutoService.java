package br.com.gustavolopes.apiproduto.service;

import br.com.gustavolopes.apiproduto.model.Produto;
import br.com.gustavolopes.apiproduto.model.ProdutoDTO;
import br.com.gustavolopes.apiproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProdutoService {


    @Autowired
    private ProdutoRepository repository;


    public List<Produto> findAll() {
        return repository.findAll();
    }

    public void create(List<ProdutoDTO> produtoDTOList) {
        repository.deleteAll();
        List<Produto> produtos = produtoDTOList.stream()
                .map(produtoDTO ->
                        Produto.builder()
                                .id(UUID.randomUUID())
                                .nome(produtoDTO.getNome())
                                .preco(produtoDTO.getPreco())
                                .urlFoto(produtoDTO.getUrlFoto())
                                .build())
                .toList();
        repository.saveAll(produtos);
    }
}
