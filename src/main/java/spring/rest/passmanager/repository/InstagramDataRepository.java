package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.InstagramData;

import java.util.Optional;

@Repository
public interface InstagramDataRepository extends JpaRepository<InstagramData, Integer> {
    Optional<InstagramData> findByUserID(int userID);
}
