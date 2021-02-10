package ua.com.owu.alex_lad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.com.owu.alex_lad.models.User;

@EnableJpaRepositories
public interface UserJpaDAO extends JpaRepository<User, Integer> {
}
