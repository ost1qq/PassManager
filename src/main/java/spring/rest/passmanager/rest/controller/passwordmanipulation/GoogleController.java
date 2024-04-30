package spring.rest.passmanager.rest.controller.passwordmanipulation;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/passwords/google")
@RestController
public class GoogleController {
    @GetMapping
    public String getGooglePassword() {
        System.out.println("Send google password request");
        return null; // return password from db
    }

    @PostMapping
    public String postGooglePassword(@RequestParam String password) {
        System.out.println("Post google password request");
        // put password into bd
        return password;
    }
}
