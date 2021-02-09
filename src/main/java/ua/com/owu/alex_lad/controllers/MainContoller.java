package ua.com.owu.alex_lad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.alex_lad.dao.UserDAO;
import ua.com.owu.alex_lad.models.Car;
import ua.com.owu.alex_lad.models.User;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainContoller {

    @Autowired
    private UserDAO userDAO;


    @GetMapping("/")
    public void addUser() {
        User user = new User();
        user.setName("vasya");
        user.setSkills(Arrays.asList("java", "js"));
        Car car1 = new Car("bubaru");
        Car car2 = new Car("bubaru2");
        user.setCars(Arrays.asList(car1, car2));
//        userDAO.addUser(user);
        userDAO.save(user);

    }


    @GetMapping("/users")
    public List<User> users() {
//        return userDAO.userList();

        return userDAO.findAllByName("vasya");
    }
}
