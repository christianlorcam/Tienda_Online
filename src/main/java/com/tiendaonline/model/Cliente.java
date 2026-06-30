package com.tiendaonline.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Esto genera los getters y setters automáticamente
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;
}