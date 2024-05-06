package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.FacebookPassword;
import spring.rest.passmanager.service.AccountService;
import spring.rest.passmanager.service.FacebookPasswordService;

@RequestMapping("/passwords/facebook")
@RestController
public class FacebookController {
    @Autowired
    private FacebookPasswordService facebookPasswordService;

    @GetMapping
    public String getFacebookPassword() {
        System.out.println("Send facebook password request");
        return null; // return password from db
    }

    @PostMapping
    public FacebookPassword postFacebookPassword(@RequestParam FacebookPassword password) {
        return facebookPasswordService.saveFacebookPassword(password);
    }
}
