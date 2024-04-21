package br.com.jptech.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDomain {
    private String id;
    private String nome;
    private String descricao;
    private String preco;
    private String id_categoria;
}
