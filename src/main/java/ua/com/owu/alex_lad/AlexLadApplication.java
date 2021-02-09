package ua.com.owu.alex_lad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.com.owu.alex_lad.dao.UserDAO;
import ua.com.owu.alex_lad.models.User;

@SpringBootApplication
public class AlexLadApplication {


    public static void main(String[] args) {
        SpringApplication.run(AlexLadApplication.class, args);

    }

}
