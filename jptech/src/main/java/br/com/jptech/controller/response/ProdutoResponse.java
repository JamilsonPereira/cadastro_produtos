package br.com.jptech.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponse {
    private UUID id_produto;
    private String nome;
    private String marca;
    private BigDecimal preco;
    private Integer quantidadeEstoque;
    private String categoria;
    private String fornecedor;
}
