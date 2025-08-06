package com.guiportela.agenda.repository;

import com.guiportela.agenda.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    List<Contato> findByNomeContainingIgnoreCase(String nome);

}
