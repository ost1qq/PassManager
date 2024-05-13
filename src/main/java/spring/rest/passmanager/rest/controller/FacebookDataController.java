package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.FacebookData;
import spring.rest.passmanager.service.FacebookDataService;

@RequestMapping("/passwords/facebook")
@RestController
public class FacebookDataController {
    @Autowired
    private FacebookDataService facebookDataService;

    @GetMapping("/get/{id}")
    public FacebookData getFacebookPassword(@PathVariable("id") Integer userID) {
        return facebookDataService.getFacebookPassword(userID);
    }

    @PostMapping("/post")
    public FacebookData postFacebookPassword(@RequestBody FacebookData password) {
        return facebookDataService.saveFacebookPassword(password);
    }

    @PutMapping("/update")
    public FacebookData updateFacebookPassword(@RequestBody FacebookData password) {
        return facebookDataService.updateFacebookPassword(password);
    }
}
