package spring.rest.passmanager.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "GooglePasswords")
@NoArgsConstructor
@AllArgsConstructor
public class GoogleData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "googleDataID")
    private int googleDataID;

    @Column(name = "UserID")
    private int userID;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;
}
