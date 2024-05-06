package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.InstagramPassword;
import spring.rest.passmanager.service.InstagramPasswordService;

@RequestMapping("/passwords/instagram")
@RestController
public class InstagramController {
    @Autowired
    private InstagramPasswordService instagramPasswordService;

    @GetMapping
    public String getInstagramPassword() {
        System.out.println("Send instagram password request");
        return null; // return password from db
    }

    @PostMapping
    public InstagramPassword postInstagramPassword(@RequestParam InstagramPassword password) {
        return instagramPasswordService.saveInstagramPassword(password);
    }
}
