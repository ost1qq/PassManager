package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.GoogleDataRepository;
import spring.rest.passmanager.rest.model.GoogleData;

@Service
public class GoogleDataService {
    @Autowired
    private GoogleDataRepository googleDataRepository;

    public GoogleData saveGooglePassword(GoogleData googleData) {
        return googleDataRepository.save(googleData);
    }

    public GoogleData getGooglePassword(Integer userID) {
        return googleDataRepository.findByUserID(userID).orElse(null);
    }

    public GoogleData updateGooglePassword(GoogleData googleData) {
        GoogleData newGoogleData = googleDataRepository.findByUserID(googleData.getUserID()).orElse(null);
        if (newGoogleData != null) {
            newGoogleData.setLogin(googleData.getLogin());
            newGoogleData.setPassword(googleData.getPassword());
            googleDataRepository.save(newGoogleData);
            return newGoogleData;
        } else {
            return null;
        }
    }
}
