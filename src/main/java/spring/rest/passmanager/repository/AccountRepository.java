package spring.rest.passmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.rest.passmanager.rest.model.Account;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Boolean existsByUsername(String username);

    Optional<Account> findByUsernameAndPassword(String username, String password);
}
