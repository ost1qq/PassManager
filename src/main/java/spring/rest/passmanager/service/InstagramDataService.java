package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.InstagramDataRepository;
import spring.rest.passmanager.rest.model.InstagramData;

@Service
public class InstagramDataService {
    @Autowired
    private InstagramDataRepository instagramDataRepository;

    public InstagramData saveInstagramPassword(InstagramData instagramData) {
        return instagramDataRepository.save(instagramData);
    }

    public InstagramData getInstagramPassword(Integer userID) {
        return instagramDataRepository.findByUserID(userID).orElse(null);
    }

    public InstagramData updateInstagramPassword(InstagramData instagramData) {
        InstagramData newInstagramData = instagramDataRepository.findByUserID(instagramData.getUserID()).orElse(null);
        if (newInstagramData != null) {
            newInstagramData.setPassword(instagramData.getPassword());
            instagramDataRepository.save(newInstagramData);
            return newInstagramData;
        } else {
            return null;
        }
    }
}
