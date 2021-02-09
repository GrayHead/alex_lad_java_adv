package ua.com.owu.alex_lad.dao;//package ua.com.owu.alex_lad.dao;
//
//import org.springframework.stereotype.Repository;
//import ua.com.owu.alex_lad.models.User;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Repository
//@Transactional
//public class UserDAO {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public void addUser(User user) {
//        entityManager.persist(user);
//
//    }
//
//
//    public List<User> userList() {
//        return entityManager.createQuery("select u from User u", User.class).getResultList();
//    }
//
//}


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.com.owu.alex_lad.models.User;

import java.util.List;

@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {

    List<User> findAllByName(String name);
}
