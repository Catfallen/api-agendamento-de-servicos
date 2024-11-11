package com.api.agendamento.repository;

import com.api.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    // Aqui você pode adicionar consultas customizadas, caso necessário.
}
