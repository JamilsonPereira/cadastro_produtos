package br.com.jptech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produtos")
public class ProdutoEntity {

    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id_produto;

    @Column("nome")
    private String nome;

    @Column("marca")
    private String marca;

    @Column("preco")
    private String preco;

    @Column("quantidade_estoque")
    private Integer quantidadeEstoque;

    @Column("categoria")
    private String categoria;

    @Column("fornecedor")
    private String fornecedor;
}