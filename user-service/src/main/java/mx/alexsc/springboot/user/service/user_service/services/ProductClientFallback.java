package mx.alexsc.springboot.user.service.user_service.services;

import org.springframework.stereotype.Component;

import mx.alexsc.springboot.user.service.user_service.controller.ProductClient;
import mx.alexsc.springboot.user.service.user_service.models.Product;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public Product getProductById(Long id) {

        // En caso de que haya una falla en la comunicacion
        // Regresamos un objeto de tipo producto
        Product product = new Product();
        product.setId(id);
        product.setName("Prodcuto no disponible");
        product.setPrice(0);
        product.setStock(0);

        return product;
    }

}
