package spring.rest.passmanager.rest.controller.accountmanipulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.rest.passmanager.business.AccountService;
import spring.rest.passmanager.rest.model.Account;

import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/account")
@RestController
public class AccountController {
    private AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    private AccountService accountService;

    @PostMapping(path = "/registration")
    public Account registration(@RequestBody Account account) {
        account.setId(idCounter.incrementAndGet());
        System.out.println(accountService.createAccount(account));
        return account;
    }

    @PostMapping(path = "/authorisation")
    public Account authorisation(@RequestBody Account account) {
        System.out.println("Authorisation request received");
        // if in db
        // then
            return account;
        // else
            // return null;
    }
}