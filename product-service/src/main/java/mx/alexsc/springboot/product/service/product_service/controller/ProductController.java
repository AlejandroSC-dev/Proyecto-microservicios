package mx.alexsc.springboot.product.service.product_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.alexsc.springboot.product.service.product_service.models.Product;
import mx.alexsc.springboot.product.service.product_service.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    // Inyectamos la clase service por medio del constructor
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        // Convertimos a JSON
        return service.save(product);
    }

}
