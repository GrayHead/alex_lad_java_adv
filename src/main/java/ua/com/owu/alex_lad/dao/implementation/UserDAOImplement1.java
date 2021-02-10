package ua.com.owu.alex_lad.dao.implementation;

import org.springframework.stereotype.Repository;
import ua.com.owu.alex_lad.dao.UserDAO;
import ua.com.owu.alex_lad.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository(value = "usdi1") // create bean
public class UserDAOImplement1 implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager; // db manipulation object

    @Override
    public List<User> users() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
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
