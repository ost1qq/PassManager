package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.GooglePassword;
import spring.rest.passmanager.service.FacebookPasswordService;
import spring.rest.passmanager.service.GooglePasswordService;

@RequestMapping("/passwords/google")
@RestController
public class GoogleController {
    @Autowired
    private GooglePasswordService googlePasswordService;

    @GetMapping
    public String getGooglePassword() {
        System.out.println("Send google password request");
        return null; // return password from db
    }

    @PostMapping
    public GooglePassword postGooglePassword(@RequestParam GooglePassword password) {
        return googlePasswordService.saveGooglePassword(password);
    }
}
