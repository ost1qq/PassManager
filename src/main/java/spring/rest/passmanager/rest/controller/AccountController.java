package spring.rest.passmanager.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.passmanager.rest.model.Account;
import spring.rest.passmanager.service.AccountService;

@RequestMapping("/account")
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping(path = "/registration")
    public Account registration(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PostMapping(path = "/authorisation")
    public Integer authorisation(@RequestBody Account account) {
        return accountService.loginInAccount(account).get().getId();
    }
}