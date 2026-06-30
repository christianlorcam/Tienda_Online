package com.tiendaonline.controller;

import com.tiendaonline.dto.ClienteRequestDTO;
import com.tiendaonline.dto.ClienteResponseDTO;
import com.tiendaonline.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public ClienteResponseDTO crear(@RequestBody ClienteRequestDTO clienteDTO) {
        // CORRECCIÓN: usamos 'service' (instancia) y 'crearCliente' (método existente)
        return service.crearCliente(clienteDTO);
    }

    @GetMapping
    public List<ClienteResponseDTO> listar() {
        return service.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO buscarPorId(@PathVariable Long id) {
        return service.buscarCliente(id);
    }
}