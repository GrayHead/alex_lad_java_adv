package ua.com.owu.alex_lad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.alex_lad.models.User;

import java.util.List;

public interface UserDAO {

    List<User> users();

    List<User> users(String name);

    User user(int id);
}
