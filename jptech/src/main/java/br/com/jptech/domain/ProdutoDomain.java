package br.com.jptech.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDomain {
    private String nome;
    private String marca;
    private BigDecimal preco;
    private Integer quantidadeEstoque;
    private String categoria;

}
