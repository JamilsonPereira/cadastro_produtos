package br.com.jptech.repository;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.annotation.processing.Generated;

@Table
public class ProdutoEntity {

    @Id
    @Column("id_produto")
    @Generated("id")
    private String id_produto;

}
