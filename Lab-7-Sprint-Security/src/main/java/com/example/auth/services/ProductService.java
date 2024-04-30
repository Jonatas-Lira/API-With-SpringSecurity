package com.example.auth.services;

import com.example.auth.dtos.ProductRequestDTO;
import com.example.auth.dtos.ProductResponseDTO;
import com.example.auth.entities.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(ProductRequestDTO productRequestDTO);

    List<ProductResponseDTO> getAllProducts();
}
