package br.com.jptech.repository;

import br.com.jptech.domain.ProdutoDomain;
import br.com.jptech.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

}
