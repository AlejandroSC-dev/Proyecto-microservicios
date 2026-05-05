package mx.alexsc.springboot.user.service.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.alexsc.springboot.user.service.user_service.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}