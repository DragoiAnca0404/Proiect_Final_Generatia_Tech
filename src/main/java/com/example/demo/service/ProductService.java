package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Metodă pentru a obține toate produsele
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Metodă pentru a obține un produs după ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Metodă pentru a crea un produs
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Metodă pentru a actualiza un produs existent
    public Product updateProduct(Long id, Product updatedProduct) {
        if (productRepository.existsById(id)) {
            updatedProduct.setId(id); // Setează ID-ul pentru a păstra același ID
            return productRepository.save(updatedProduct);
        }
        return null; // Dacă produsul nu există, returnează null
    }

    // Metodă pentru a șterge un produs
    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false; // Dacă produsul nu există, returnează false
    }
}

