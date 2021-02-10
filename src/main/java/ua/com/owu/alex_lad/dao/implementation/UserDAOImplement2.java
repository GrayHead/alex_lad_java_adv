package ua.com.owu.alex_lad.dao.implementation;

import org.springframework.stereotype.Repository;
import ua.com.owu.alex_lad.dao.UserDAO;
import ua.com.owu.alex_lad.models.User;

import java.util.List;

@Repository(value = "usdi2")
public class UserDAOImplement2 implements UserDAO {

    @Override
    public List<User> users() {
        return null;
    }

    @Override
    public List<User> users(String name) {
        return null;
    }

    @Override
    public User user(int id) {
        return null;
    }
}
