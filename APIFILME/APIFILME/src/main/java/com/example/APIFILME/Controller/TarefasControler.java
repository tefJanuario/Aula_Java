package com.example.APIFILME.Controller;

import com.example.APIFILME.Model.TarefasModel;
import com.example.APIFILME.Repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasControler {
    @Autowired
    private TarefasRepository repository;

    @GetMapping("/buscar")
    public List<TarefasModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public TarefasModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public TarefasModel atualizar(@RequestBody TarefasModel tarefas) {
        return repository.save(tarefas);
    }

    @PostMapping("/adicionar")
    public TarefasModel salvar(@RequestBody TarefasModel tarefas) {
        return repository.save(tarefas);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
    @GetMapping("/buscarStatus/{STATUS}")
    public List<TarefasModel> buscarPorStatus(@PathVariable String STATUS) {
        return repository.findBySTATUS(STATUS);
    }
    @GetMapping("/buscarPrioridades/{PRIORIDADE}")
    public List<TarefasModel> buscarPorPrioridade(@PathVariable String PRIORIDADE) {
        return repository.findByPRIORIDADE(PRIORIDADE);
    }
}
