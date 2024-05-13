package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.FacebookDataRepository;
import spring.rest.passmanager.rest.model.FacebookData;

@Service
public class FacebookDataService {
    @Autowired
    private FacebookDataRepository facebookDataRepository;

    public FacebookData saveFacebookPassword(FacebookData facebookData) {
        return facebookDataRepository.save(facebookData);
    }

    public FacebookData getFacebookPassword(Integer userID) {
        return facebookDataRepository.findByUserID(userID).orElse(null);
    }

    public FacebookData updateFacebookPassword(FacebookData facebookData) {
        FacebookData newFacebookData = facebookDataRepository.findByUserID(facebookData.getUserID()).orElse(null);
        if (newFacebookData != null) {
            newFacebookData.setLogin(facebookData.getLogin());
            newFacebookData.setPassword(facebookData.getPassword());
            facebookDataRepository.save(newFacebookData);
            return newFacebookData;
        } else {
            return null;
        }
    }
}
