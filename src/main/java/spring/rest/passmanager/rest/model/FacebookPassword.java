package spring.rest.passmanager.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "FacebookPasswords")
@NoArgsConstructor
@AllArgsConstructor
public class FacebookPassword {
    @Id
    @Column(name = "UserID")
    private int userID;

    @Column(name = "Password")
    private String password;
}
