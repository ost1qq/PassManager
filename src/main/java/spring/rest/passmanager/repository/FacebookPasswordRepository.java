package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.FacebookPassword;

@Repository
public interface FacebookPasswordRepository extends JpaRepository<FacebookPassword, Integer> {

}
