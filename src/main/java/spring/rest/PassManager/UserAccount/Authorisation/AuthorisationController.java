package spring.rest.PassManager.UserAccount.Authorisation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.PassManager.UserAccount.AccountInfo.*;

@RequestMapping("/authorisation.html")
@RestController
public class AuthorisationController {

    @GetMapping("/login")
    public String login(@RequestBody AccountInfo userCredentials) {
        String username = userCredentials.getUsername();
        String password = userCredentials.getPassword();

        if ("user".equals(username) && "pass".equals(password)) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
