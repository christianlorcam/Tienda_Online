package com.tiendaonline.service;

import com.tiendaonline.dto.ClienteRequestDTO;
import com.tiendaonline.dto.ClienteResponseDTO;
import com.tiendaonline.mapper.ClienteMapper;
import com.tiendaonline.model.Cliente;
import com.tiendaonline.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    // Inyección de dependencias
    public ClienteService(ClienteRepository repository, ClienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ClienteResponseDTO crearCliente(ClienteRequestDTO dto) {
        Cliente cliente = mapper.toEntity(dto);
        cliente = repository.save(cliente);
        return mapper.toResponseDTO(cliente);
    }

    public List<ClienteResponseDTO> listarClientes() {
        return repository.findAll().stream()
                .map(mapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public ClienteResponseDTO buscarCliente(Long id) {
        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        return mapper.toResponseDTO(cliente);
    }
}