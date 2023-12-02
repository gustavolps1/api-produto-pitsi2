package br.com.gustavolopes.apiproduto.controller;

import br.com.gustavolopes.apiproduto.model.Produto;
import br.com.gustavolopes.apiproduto.model.ProdutoDTO;
import br.com.gustavolopes.apiproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Produto> getFindAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<?> postCreateProduto(@RequestBody List<ProdutoDTO> request){
         service.create(request);
         return ResponseEntity.ok("success");
    }
}
