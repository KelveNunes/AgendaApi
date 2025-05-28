package com.agenda.Agenda.repository;

import com.agenda.Agenda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos customizados podem ser adicionados aqui
}