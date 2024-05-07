package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.InstagramPasswordRepository;
import spring.rest.passmanager.rest.model.FacebookPassword;
import spring.rest.passmanager.rest.model.InstagramPassword;

@Service
public class InstagramPasswordService {
    @Autowired
    private InstagramPasswordRepository instagramPasswordRepository;

    public InstagramPassword saveInstagramPassword(InstagramPassword instagramPassword) {
        return instagramPasswordRepository.save(instagramPassword);
    }

    public InstagramPassword getInstagramPassword(Integer userID) {
        return instagramPasswordRepository.findById(userID).orElse(null);
    }

    public InstagramPassword updateInstagramPassword(InstagramPassword instagramPassword) {
        InstagramPassword newInstagramPassword = instagramPasswordRepository.findById(instagramPassword.getUserID()).orElse(null);
        if (newInstagramPassword != null) {
            newInstagramPassword.setPassword(instagramPassword.getPassword());
            instagramPasswordRepository.save(newInstagramPassword);
            return newInstagramPassword;
        } else {
            return null;
        }
    }
}
