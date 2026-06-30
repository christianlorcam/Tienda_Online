package com.tiendaonline.controller;

import com.tiendaonline.dto.ProductoRequestDTO;
import com.tiendaonline.dto.ProductoResponseDTO;
import com.tiendaonline.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public ProductoResponseDTO crear(@RequestBody ProductoRequestDTO dto) {
        return service.crearProducto(dto);
    }

    @GetMapping
    public List<ProductoResponseDTO> listar() {
        return service.listarProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.buscarProducto(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarProducto(id);
    }
}