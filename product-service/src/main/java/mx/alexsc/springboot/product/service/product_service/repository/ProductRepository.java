package mx.alexsc.springboot.product.service.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.alexsc.springboot.product.service.product_service.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
