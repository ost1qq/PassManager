package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.InstagramPassword;

@Repository
public interface InstagramPasswordRepository extends JpaRepository<InstagramPassword, Integer> {

}
