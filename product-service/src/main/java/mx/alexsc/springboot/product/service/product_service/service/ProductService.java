package mx.alexsc.springboot.product.service.product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.alexsc.springboot.product.service.product_service.models.Product;
import mx.alexsc.springboot.product.service.product_service.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    // Inyectamos por medio del constructor
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // Creamos una lista de productos
    public List<Product> getAll() {
        return repository.findAll();
    }

    // Guardamos los productos
    public Product save(Product product) {
        return repository.save(product);
    }

    // Obtenemos por medio del ID del producto
    public Product getById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
