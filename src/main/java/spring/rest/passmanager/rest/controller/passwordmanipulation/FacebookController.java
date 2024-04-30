package spring.rest.passmanager.rest.controller.passwordmanipulation;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/passwords/facebook")
@RestController
public class FacebookController {
    @GetMapping
    public String getFacebookPassword() {
        System.out.println("Send facebook password request");
        return null; // return password from db
    }

    @PostMapping
    public String postFacebookPassword(@RequestParam String password) {
        System.out.println("Post facebook password request");
        // put password into bd
        return password;
    }
}
