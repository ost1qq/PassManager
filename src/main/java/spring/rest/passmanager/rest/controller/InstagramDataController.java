package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.rest.model.InstagramData;
import spring.rest.passmanager.service.InstagramDataService;

@RequestMapping("/passwords/instagram")
@RestController
public class InstagramDataController {
    @Autowired
    private InstagramDataService instagramDataService;

    @GetMapping("/get/{id}")
    public InstagramData getInstagramPassword(@PathVariable("id") Integer userID) {
        return instagramDataService.getInstagramPassword(userID);
    }

    @PostMapping("/post")
    public InstagramData postInstagramPassword(@RequestBody InstagramData password) {
        return instagramDataService.saveInstagramPassword(password);
    }

    @PutMapping("/update")
    public InstagramData updateFacebookPassword(@RequestBody InstagramData password) {
        return instagramDataService.updateInstagramPassword(password);
    }
}
