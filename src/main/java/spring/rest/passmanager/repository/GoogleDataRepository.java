package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.GoogleData;

import java.util.Optional;

@Repository
public interface GoogleDataRepository extends JpaRepository<GoogleData, Integer> {
    Optional<GoogleData> findByUserID(int userID);
}
