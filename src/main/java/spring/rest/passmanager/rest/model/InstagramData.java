package spring.rest.passmanager.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "InstagramPasswords")
@NoArgsConstructor
@AllArgsConstructor
public class InstagramData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "instagramDataID")
    private int instagramDataID;

    @Column(name = "UserID")
    private int userID;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;
}
