package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.GooglePassword;
import spring.rest.passmanager.service.GooglePasswordService;

@RequestMapping("/passwords/google")
@RestController
public class GoogleController {
    @Autowired
    private GooglePasswordService googlePasswordService;

    @GetMapping("/get/{id}")
    public GooglePassword getGooglePassword(@PathVariable("id") Integer userID) {
        return googlePasswordService.getGooglePassword(userID);
    }

    @PostMapping("/post")
    public GooglePassword postGooglePassword(@RequestBody GooglePassword password) {
        return googlePasswordService.saveGooglePassword(password);
    }

    @PutMapping("/update")
    public GooglePassword updateFacebookPassword(@RequestBody GooglePassword password) {
        return googlePasswordService.updateGooglePassword(password);
    }
}
