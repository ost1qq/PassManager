package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.FacebookData;

import java.util.Optional;

@Repository
public interface FacebookDataRepository extends JpaRepository<FacebookData, Integer> {
    Optional<FacebookData> findByUserID(int userID);
}
