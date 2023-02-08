package com.example.APIFILME.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table (name = "TAREFAS")
@Entity
public class TarefasModel {
    @Id
    @Column(name = "ID_TAREFA")
    private int ID_TAREFA;

    @Column(name = "NOME_TAREFA")
    private String NOME_TAREFA;

    @Column(name = "DESCRICAO_TAREFA")
    private String DESCRICAO_TAREFA;

    @Column(name = "DATA_INICIO")
    private Date dataLancamento;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "PRIORIDADE")
    private String PRIORIDADE;

}
