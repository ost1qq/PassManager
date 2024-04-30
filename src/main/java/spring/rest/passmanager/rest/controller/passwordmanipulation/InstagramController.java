package spring.rest.passmanager.rest.controller.passwordmanipulation;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/passwords/instagram")
@RestController
public class InstagramController {
    @GetMapping
    public String getInstagramPassword() {
        System.out.println("Send instagram password request");
        return null; // return password from db
    }

    @PostMapping
    public String postInstagramPassword(@RequestParam String password) {
        System.out.println("Post instagram password request");
        // put password into bd
        return password;
    }
}
