package com.example.APIFILME.Repository;

import com.example.APIFILME.Model.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TarefasRepository extends JpaRepository<TarefasModel, Integer> {

    public List<TarefasModel> findBySTATUS(String STATUS);

    public List<TarefasModel> findByPRIORIDADE(String PRIORIDADE);
}
