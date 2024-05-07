package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.FacebookPassword;
import spring.rest.passmanager.service.FacebookPasswordService;

@RequestMapping("/passwords/facebook")
@RestController
public class FacebookController {
    @Autowired
    private FacebookPasswordService facebookPasswordService;

    @GetMapping("/get/{id}")
    public FacebookPassword getFacebookPassword(@PathVariable("id") Integer userID) {
        return facebookPasswordService.getFacebookPassword(userID);
    }

    @PostMapping("/post")
    public FacebookPassword postFacebookPassword(@RequestBody FacebookPassword password) {
        return facebookPasswordService.saveFacebookPassword(password);
    }

    @PutMapping("/update")
    public FacebookPassword updateFacebookPassword(@RequestBody FacebookPassword password) {
        return facebookPasswordService.updateFacebookPassword(password);
    }
}
