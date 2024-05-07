package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.FacebookPasswordRepository;
import spring.rest.passmanager.rest.model.FacebookPassword;

@Service
public class FacebookPasswordService {
    @Autowired
    private FacebookPasswordRepository facebookPasswordRepository;

    public FacebookPassword saveFacebookPassword(FacebookPassword facebookPassword) {
        return facebookPasswordRepository.save(facebookPassword);
    }

    public FacebookPassword getFacebookPassword(Integer userID) {
        return facebookPasswordRepository.findById(userID).orElse(null);
    }

    public FacebookPassword updateFacebookPassword(FacebookPassword facebookPassword) {
        FacebookPassword newFacebookPassword = facebookPasswordRepository.findById(facebookPassword.getUserID()).orElse(null);
        if (newFacebookPassword != null) {
            newFacebookPassword.setPassword(facebookPassword.getPassword());
            facebookPasswordRepository.save(newFacebookPassword);
            return newFacebookPassword;
        } else {
            return null;
        }
    }
}
