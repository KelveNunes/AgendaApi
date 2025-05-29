package com.agenda.Agenda.service;

import com.agenda.Agenda.model.Compromisso;
import com.agenda.Agenda.repository.CompromissoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompromissoService {
    private final CompromissoRepository compromissoRepository;

    public CompromissoService(CompromissoRepository compromissoRepository) {
        this.compromissoRepository = compromissoRepository;
    }

    public List<Compromisso> listarTodos() {
        return compromissoRepository.findAll();
    }

    public Optional<Compromisso> buscarPorId(Long id) {
        return compromissoRepository.findById(id);
    }

    public Compromisso salvar(Compromisso compromisso) {
        return compromissoRepository.save(compromisso);
    }

    public void deletar(Long id) {
        compromissoRepository.deleteById(id);
    }
}