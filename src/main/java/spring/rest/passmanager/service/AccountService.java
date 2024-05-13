package spring.rest.passmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.passmanager.repository.AccountRepository;
import spring.rest.passmanager.rest.model.Account;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        if (accountRepository.existsByUsername(account.getUsername())) {
            return null;
        } else {
            return accountRepository.save(account);
        }
    }

    public Optional<Account> loginInAccount(Account account) {
        if (accountRepository.existsByUsername(account.getUsername())) {
            return accountRepository.findByUsernameAndPassword(account.getUsername(), account.getPassword());
        } else {
            return Optional.empty();
        }
    }
}
