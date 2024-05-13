package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.GoogleData;
import spring.rest.passmanager.service.GoogleDataService;

@RequestMapping("/passwords/google")
@RestController
public class GoogleDataController {
    @Autowired
    private GoogleDataService googleDataService;

    @GetMapping("/get/{id}")
    public GoogleData getGooglePassword(@PathVariable("id") Integer userID) {
        return googleDataService.getGooglePassword(userID);
    }

    @PostMapping("/post")
    public GoogleData postGooglePassword(@RequestBody GoogleData password) {
        return googleDataService.saveGooglePassword(password);
    }

    @PutMapping("/update")
    public GoogleData updateFacebookPassword(@RequestBody GoogleData password) {
        return googleDataService.updateGooglePassword(password);
    }
}
