package mx.alexsc.springboot.user.service.user_service.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mx.alexsc.springboot.user.service.user_service.models.Product;
import mx.alexsc.springboot.user.service.user_service.services.ProductClientFallback;

@FeignClient(name = "PRODUCT-SERVICE", fallback = ProductClientFallback.class)
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id);
}
