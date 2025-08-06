package com.guiportela.agenda.controller;

import com.guiportela.agenda.model.Contato;
import com.guiportela.agenda.service.ContatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Contato>> buscarPorNome(@RequestParam String nome) {
        List<Contato> contatos = contatoService.buscarPorNome(nome);
        if (contatos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(contatos);
    }
    @GetMapping
    public ResponseEntity<List<Contato>> listarTodos() {
        List<Contato> contatos = contatoService.listarTodos();
        if (contatos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(contatos);
    }
    @PostMapping
    public ResponseEntity<Contato> criarContato(@RequestBody Contato contato) {
        Contato novoContato = contatoService.salvar(contato);
        return ResponseEntity.ok(novoContato);
    }

}
