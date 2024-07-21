package br.com.jptech.controller;

import br.com.jptech.controller.request.ProdutoRequest;
import br.com.jptech.controller.response.ProdutoResponse;
import br.com.jptech.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

@Autowired
private ProdutoService produtoService;

        @PostMapping("/salvar")
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<ProdutoResponse> createProduct(@RequestBody ProdutoRequest produto) {
            ProdutoResponse response = produtoService.salvarProduto(produto);
           return ResponseEntity.ok(response);
        }
}
