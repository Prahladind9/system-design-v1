package edu.prahlad.casestudy.onlinebank.controller;

import edu.prahlad.casestudy.onlinebank.entity.PrimaryTransaction;
import edu.prahlad.casestudy.onlinebank.entity.SavingsTransaction;
import edu.prahlad.casestudy.onlinebank.entity.Users;
import edu.prahlad.casestudy.onlinebank.model.AccountUserModel;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.service.AccountService;
import edu.prahlad.casestudy.onlinebank.service.TransactionService;
import edu.prahlad.casestudy.onlinebank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @PostMapping("primaryTransaction")
    public List<PrimaryTransaction> primaryTransaction(@RequestBody String userName) throws CaseStudyException{
        return this.transactionService.findByPrimaryTransactionList(userName);
    }

    @PostMapping("savingsTransaction")
    public List<SavingsTransaction> savingsTransaction(@RequestBody String userName) throws CaseStudyException{
        return this.transactionService.findBySavingsTransactionList(userName);
    }

    @PostMapping("deposit")
    public AccountUserModel deposit(@RequestBody AccountUserModel accountUserModel) throws CaseStudyException{
        return this.accountService.deposit(accountUserModel);
    }

    @PostMapping("withdraw")
    public AccountUserModel withdraw(@RequestBody AccountUserModel accountUserModel) throws CaseStudyException{
        return this.accountService.withdraw(accountUserModel);
    }

}
