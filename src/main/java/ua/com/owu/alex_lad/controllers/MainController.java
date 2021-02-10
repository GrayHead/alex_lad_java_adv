package ua.com.owu.alex_lad.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.alex_lad.dao.UserDAO;
import ua.com.owu.alex_lad.dao.UserJpaDAO;
import ua.com.owu.alex_lad.models.User;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainController {

    private UserJpaDAO userJpaDAO;
    private UserDAO userDAO;

    public MainController(@Qualifier("usdi1") UserDAO userDAO, UserJpaDAO userJpaDAO) {
        this.userDAO = userDAO;
        this.userJpaDAO = userJpaDAO;
    }

//    @PostMapping("/saveUser")
//    public List<User> saveUser(@RequestBody User user) {
//        userJpaDAO.save(user);
//        return userJpaDAO.findAll();
//    }


    @PostMapping("/saveUser")
    public ResponseEntity<List<User>> saveUser(@RequestBody User user) {
        userJpaDAO.save(user);
        return new ResponseEntity<List<User>>(userJpaDAO.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public void saveUser(
            @RequestParam String name,
            @RequestParam String password

    ) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        System.out.println(user);
        userJpaDAO.save(user);
    }


}
