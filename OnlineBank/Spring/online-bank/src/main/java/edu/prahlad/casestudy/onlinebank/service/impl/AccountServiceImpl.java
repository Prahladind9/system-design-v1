package edu.prahlad.casestudy.onlinebank.service.impl;

import edu.prahlad.casestudy.onlinebank.constants.AccountType;
import edu.prahlad.casestudy.onlinebank.constants.ErrorCodes;
import edu.prahlad.casestudy.onlinebank.entity.*;

import edu.prahlad.casestudy.onlinebank.model.AccountUserModel;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.repo.PrimaryAccountRepo;
import edu.prahlad.casestudy.onlinebank.repo.SavingsAccountRepo;
import edu.prahlad.casestudy.onlinebank.repo.UsersRepo;

import edu.prahlad.casestudy.onlinebank.service.AccountService;
import edu.prahlad.casestudy.onlinebank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 11223148;

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private PrimaryAccountRepo primaryAccountRepo;

    @Autowired
    private SavingsAccountRepo savingsAccountRepo;

    @Autowired
    private TransactionService transactionService;



    private int accountGen() {
        return ++nextAccountNumber;
    }


    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountRepo.save(primaryAccount);

        return primaryAccountRepo.findByAccountNumber(primaryAccount.getAccountNumber());

    }

    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountRepo.save(savingsAccount);

        return savingsAccountRepo.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    @Override
    public AccountUserModel deposit(AccountUserModel accountUserModel) throws CaseStudyException {
        Users user = usersRepo.findByUserName(accountUserModel.getUserName());

        if(AccountType.Primary.equals(accountUserModel.getAccountType())){
            PrimaryAccount primaryAccount = user.getPrimaryAccount();
            primaryAccount.setAccountBalance(
                    primaryAccount.getAccountBalance().add(new BigDecimal(accountUserModel.getTransactionAmount())));

            primaryAccountRepo.save(primaryAccount);

            PrimaryTransaction primaryTransaction = new PrimaryTransaction();
            primaryTransaction.setPrimaryAccount(primaryAccount);
            primaryTransaction.setAmount(accountUserModel.getTransactionAmount());
            primaryTransaction.setAvailableBalance(primaryAccount.getAccountBalance());
            primaryTransaction.setDate(new Date());
            primaryTransaction.setDescription("Deposit to Primary Account");
            primaryTransaction.setType(accountUserModel.getAccountType().toString());
            primaryTransaction.setStatus("Finished");

            transactionService.savePrimaryDepositTransaction(primaryTransaction);
        }else if(AccountType.Savings.equals(accountUserModel.getAccountType())){
            SavingsAccount savingsAccount = user.getSavingsAccount();
            savingsAccount.setAccountBalance(
                    savingsAccount.getAccountBalance().add(new BigDecimal(accountUserModel.getTransactionAmount())));

            savingsAccountRepo.save(savingsAccount);

            SavingsTransaction savingsTransaction = new SavingsTransaction();
            savingsTransaction.setSavingsAccount(savingsAccount);
            savingsTransaction.setAmount(accountUserModel.getTransactionAmount());
            savingsTransaction.setAvailableBalance(savingsAccount.getAccountBalance());
            savingsTransaction.setDate(new Date());
            savingsTransaction.setDescription("Deposit to Savings Account");
            savingsTransaction.setType(accountUserModel.getAccountType().toString());
            savingsTransaction.setStatus("Finished");
            transactionService.saveSavingDepositTransaction(savingsTransaction);
        }else{
            throw new CaseStudyException(ErrorCodes.E_UNDEFINED_ACCOUNT_TYPE,"");
        }

        return accountUserModel;

    }

    @Override
    public AccountUserModel withdraw(AccountUserModel accountUserModel) throws CaseStudyException{
        Users user = usersRepo.findByUserName(accountUserModel.getUserName());

        if(AccountType.Primary.equals(accountUserModel.getAccountType())){
            PrimaryAccount primaryAccount = user.getPrimaryAccount();
            primaryAccount.setAccountBalance(
                    primaryAccount.getAccountBalance().subtract(new BigDecimal(accountUserModel.getTransactionAmount())));

            primaryAccountRepo.save(primaryAccount);

            PrimaryTransaction primaryTransaction = new PrimaryTransaction();
            primaryTransaction.setPrimaryAccount(primaryAccount);
            primaryTransaction.setAmount(accountUserModel.getTransactionAmount());
            primaryTransaction.setAvailableBalance(primaryAccount.getAccountBalance());
            primaryTransaction.setDate(new Date());
            primaryTransaction.setDescription("Withdraw from Primary Account");
            primaryTransaction.setType(accountUserModel.getAccountType().toString());
            primaryTransaction.setStatus("Finished");

            transactionService.savePrimaryWithdrawTransaction(primaryTransaction);
        }else if(AccountType.Savings.equals(accountUserModel.getAccountType())){
            SavingsAccount savingsAccount = user.getSavingsAccount();
            savingsAccount.setAccountBalance(
                    savingsAccount.getAccountBalance().subtract(new BigDecimal(accountUserModel.getTransactionAmount())));

            savingsAccountRepo.save(savingsAccount);

            SavingsTransaction savingsTransaction = new SavingsTransaction();
            savingsTransaction.setSavingsAccount(savingsAccount);
            savingsTransaction.setAmount(accountUserModel.getTransactionAmount());
            savingsTransaction.setAvailableBalance(savingsAccount.getAccountBalance());
            savingsTransaction.setDate(new Date());
            savingsTransaction.setDescription("Withdraw from Savings Account");
            savingsTransaction.setType(accountUserModel.getAccountType().toString());
            savingsTransaction.setStatus("Finished");
            transactionService.saveSavingsWithdrawTransaction(savingsTransaction);
        }else{
            throw new CaseStudyException(ErrorCodes.E_UNDEFINED_ACCOUNT_TYPE,"");
        }

        return accountUserModel;
    }
}
