package com.tiendaonline.service;

import com.tiendaonline.dto.ProductoRequestDTO;
import com.tiendaonline.dto.ProductoResponseDTO;
import com.tiendaonline.mapper.ProductoMapper;
import com.tiendaonline.model.Producto;
import com.tiendaonline.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    public ProductoService(ProductoRepository repository, ProductoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductoResponseDTO crearProducto(ProductoRequestDTO dto) {
        Producto producto = mapper.toEntity(dto);
        producto = repository.save(producto);
        return mapper.toResponseDTO(producto);
    }

    public List<ProductoResponseDTO> listarProductos() {
        return repository.findAll().stream()
                .map(mapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public ProductoResponseDTO buscarProducto(Long id) {
        Producto producto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return mapper.toResponseDTO(producto);
    }

    public void eliminarProducto(Long id) {
        repository.deleteById(id);
    }
}