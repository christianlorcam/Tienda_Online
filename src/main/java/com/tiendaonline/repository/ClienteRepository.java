package com.tiendaonline.repository;

import com.tiendaonline.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Al extender JpaRepository, Spring ya sabe cómo guardar, listar y buscar por ID [cite: 128-131].
}