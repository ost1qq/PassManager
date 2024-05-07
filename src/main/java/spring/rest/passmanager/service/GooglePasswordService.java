package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.AccountRepository;
import spring.rest.passmanager.repository.GooglePasswordRepository;
import spring.rest.passmanager.rest.model.FacebookPassword;
import spring.rest.passmanager.rest.model.GooglePassword;

@Service
public class GooglePasswordService {
    @Autowired
    private GooglePasswordRepository googlePasswordRepository;

    public GooglePassword saveGooglePassword(GooglePassword googlePassword) {
        return googlePasswordRepository.save(googlePassword);
    }

    public GooglePassword getGooglePassword(Integer userID) {
        return googlePasswordRepository.findById(userID).orElse(null);
    }

    public GooglePassword updateGooglePassword(GooglePassword googlePassword) {
        GooglePassword newGooglePassword = googlePasswordRepository.findById(googlePassword.getUserID()).orElse(null);
        if (newGooglePassword != null) {
            newGooglePassword.setPassword(googlePassword.getPassword());
            googlePasswordRepository.save(newGooglePassword);
            return newGooglePassword;
        } else {
            return null;
        }
    }
}
