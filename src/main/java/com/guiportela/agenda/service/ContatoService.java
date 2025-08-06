package com.guiportela.agenda.service;

import com.guiportela.agenda.model.Contato;
import com.guiportela.agenda.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contato> listarTodos() {
        return contatoRepository.findAll();
    }

    public Optional<Contato> buscarPorId(Long id) {
        return contatoRepository.findById(id);
    }

    public Contato salvar(Contato contato) {
        return contatoRepository.save(contato);
    }

    public void deletar(Long id) {
        contatoRepository.deleteById(id);
    }
    public List<Contato> buscarPorNome(String nome) {
        return contatoRepository.findByNomeContainingIgnoreCase(nome);
    }
}
