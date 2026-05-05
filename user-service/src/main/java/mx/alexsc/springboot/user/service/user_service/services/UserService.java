package mx.alexsc.springboot.user.service.user_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.alexsc.springboot.user.service.user_service.controller.ProductClient;
import mx.alexsc.springboot.user.service.user_service.models.Product;
import mx.alexsc.springboot.user.service.user_service.models.User;
import mx.alexsc.springboot.user.service.user_service.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;
    private final ProductClient productClient;

    // Inyectamos por medio del constructor
    public UserService(UserRepository repository, ProductClient productClient) {
        this.repository = repository;
        this.productClient = productClient;
    }

    // Listar usuarios
    public List<User> getAll() {
        return repository.findAll();
    }

    // Guardar usuario
    public User save(User user) {
        return repository.save(user);
    }

    public Product getProductFromOtherService(Long productId) {
        return productClient.getProductById(productId); // Consulta con Eureka para buscar el otro servicio ´
        // y hacer la peticion HTTP
    }

}
