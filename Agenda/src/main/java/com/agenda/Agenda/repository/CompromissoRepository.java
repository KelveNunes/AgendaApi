package com.agenda.Agenda.repository;

import com.agenda.Agenda.model.Compromisso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {
    // Métodos customizados podem ser adicionados aqui
}