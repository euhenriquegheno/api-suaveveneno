package br.com.suaveveneno.api_suaveveneno.repository;

import br.com.suaveveneno.api_suaveveneno.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
