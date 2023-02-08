package com.example.APIFILME.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "ste_filmes")
//@Table(name = "ANA_FILMES")
@Entity
public class FilmesModel {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOME")
    private String NOME;

    @Column(name = "DESCRICAO")
    private String DESCRICAO;

    @Column(name = "DATA_LANCAMENTO")
    private Date dataLancamento;

    @Column(name = "QUANTIDADE_VENDAS")
    private String QUANTIDADE_VENDAS;

    @Column(name = "PAIS_ORIGEM")
    private String PAIS_ORIGEM;
}