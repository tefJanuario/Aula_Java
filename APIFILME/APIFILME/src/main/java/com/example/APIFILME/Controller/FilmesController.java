package com.example.APIFILME.Controller;

import com.example.APIFILME.Model.FilmesModel;
import com.example.APIFILME.Repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RequestMapping("/filmes")
@RestController
public class FilmesController {

    @Autowired
    private FilmesRepository repository;

    @GetMapping("/buscar")
    public List<FilmesModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public FilmesModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public FilmesModel atualizar(@RequestBody FilmesModel usuario) {
        return repository.save(usuario);
    }

    @PostMapping("/adicionar")
    public FilmesModel salvar(@RequestBody FilmesModel usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/pesquisaFilmeAno")
    public List<FilmesModel> encontraFilmeAno() {
        return repository.encontraFilmeAno();
    }

    @GetMapping("/buscarPorPais/{PAIS_ORIGEM}")
    public List<FilmesModel> buscarPorPais(@PathVariable String PAIS_ORIGEM) {
        return repository.findByPAIS_ORIGEM(PAIS_ORIGEM);
    }

    @GetMapping("buscarPorData/{dataLancamento}")
    public List<FilmesModel> buscaPorData(@PathVariable Date dataLancamento){
        return repository.findByDataLancamento(dataLancamento);
        }
}
