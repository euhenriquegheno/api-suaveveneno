package br.com.suaveveneno.api_suaveveneno.service;

import br.com.suaveveneno.api_suaveveneno.model.Produto;
import br.com.suaveveneno.api_suaveveneno.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

}
