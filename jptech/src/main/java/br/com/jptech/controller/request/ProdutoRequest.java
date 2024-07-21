package br.com.jptech.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {
    private String nome;
    private String marca;
    private BigDecimal preco;
    private Integer quantidadeEstoque;
    private String categoria;
    private String fornecedor;

}