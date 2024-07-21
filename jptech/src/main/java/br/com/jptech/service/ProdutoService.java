package br.com.jptech.service;

import br.com.jptech.controller.request.ProdutoRequest;
import br.com.jptech.controller.response.ProdutoResponse;
import br.com.jptech.entity.ProdutoEntity;
import br.com.jptech.mapper.ProdutoMapper;
import br.com.jptech.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    public ProdutoResponse salvarProduto(ProdutoRequest produtoRequest) {
        ProdutoEntity produtoEntity = produtoMapper.mapperRequestParaEntity(produtoRequest);

        ProdutoResponse produtoResponse = produtoMapper.mapperEntityParaResponse(produtoEntity);

        produtoRepository.save(produtoEntity);
        return produtoResponse;
    }
}
