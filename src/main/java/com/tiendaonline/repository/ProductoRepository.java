package com.tiendaonline.repository;

import com.tiendaonline.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Aquí ya tienes los métodos para guardar, listar, buscar por ID y eliminar [cite: 134-138].
}