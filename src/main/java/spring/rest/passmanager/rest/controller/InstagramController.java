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

    @GetMapping("/get/{id}")
    public InstagramPassword getInstagramPassword(@PathVariable("id") Integer userID) {
        return instagramPasswordService.getInstagramPassword(userID);
    }

    @PostMapping("/post")
    public InstagramPassword postInstagramPassword(@RequestBody InstagramPassword password) {
        return instagramPasswordService.saveInstagramPassword(password);
    }

    @PutMapping("/update")
    public InstagramPassword updateFacebookPassword(@RequestBody InstagramPassword password) {
        return instagramPasswordService.updateInstagramPassword(password);
    }
}
