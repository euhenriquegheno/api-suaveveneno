package br.com.suaveveneno.api_suaveveneno.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Produto {

    @Id
    @Column(name="idpk")
    private Long idpk;
    private String nome;
    private String descricao;
    private String urlFoto;

}
