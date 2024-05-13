package spring.rest.passmanager.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "FacebookData")
@NoArgsConstructor
@AllArgsConstructor
public class FacebookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "facebookDataID")
    private int facebookDataID;

    @Column(name = "UserID")
    private int userID;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;
}
