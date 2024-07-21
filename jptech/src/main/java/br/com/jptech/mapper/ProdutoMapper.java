package br.com.jptech.mapper;

import br.com.jptech.controller.request.ProdutoRequest;
import br.com.jptech.controller.response.ProdutoResponse;
import br.com.jptech.domain.ProdutoDomain;
import br.com.jptech.entity.ProdutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {
    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    ProdutoResponse produtoRequestParaDomain(ProdutoRequest produtoRequest);

    ProdutoRequest produtoDomainParaRequest(ProdutoDomain produtoDomain);

    ProdutoEntity mapperRequestParaEntity(ProdutoRequest produtoRequest);

    ProdutoResponse mapperEntityParaResponse(ProdutoEntity produtoEntity);

}
