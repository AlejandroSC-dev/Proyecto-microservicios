package mx.alexsc.springboot.user.service.user_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.alexsc.springboot.user.service.user_service.models.Product;
import mx.alexsc.springboot.user.service.user_service.models.User;
import mx.alexsc.springboot.user.service.user_service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    // Inyectamos el servicio por medio del constructor
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    // Colocamos el endpoint
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getProductFromOtherService(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }

}
