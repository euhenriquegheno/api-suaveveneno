package br.com.suaveveneno.api_suaveveneno.controller;

import br.com.suaveveneno.api_suaveveneno.model.Produto;
import br.com.suaveveneno.api_suaveveneno.repository.ProdutoRepository;
import br.com.suaveveneno.api_suaveveneno.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listarProdutos(){
        return produtoService.listarTodos();
    }

}
