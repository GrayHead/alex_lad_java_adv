package ua.com.owu.alex_lad.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    @ElementCollection()
    private List<String> skills = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private Sex sex = Sex.MALE;
}
