package com.example.APIFILME.Repository;

import com.example.APIFILME.Model.FilmesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface FilmesRepository extends JpaRepository<FilmesModel, Integer> {

    @Query(value = "SELECT * FROM STE_FILMES WHERE upper(DATA_LANCAMENTO) LIKE '%22%'", nativeQuery = true)
    public List<FilmesModel> encontraFilmeAno();
    @Query(value = "SELECT * FROM STE_FILMES WHERE PAIS_ORIGEM = ?1", nativeQuery = true)
    public List<FilmesModel> findByPAIS_ORIGEM(String PAIS_ORIGEM);

    public List<FilmesModel> findByDataLancamento(Date dataLancamento);




}
