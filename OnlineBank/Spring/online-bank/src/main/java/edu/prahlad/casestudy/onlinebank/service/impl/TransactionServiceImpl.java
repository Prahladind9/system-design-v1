package edu.prahlad.casestudy.onlinebank.service.impl;

import edu.prahlad.casestudy.onlinebank.constants.AccountType;
import edu.prahlad.casestudy.onlinebank.constants.ErrorCodes;
import edu.prahlad.casestudy.onlinebank.entity.*;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.repo.*;
import edu.prahlad.casestudy.onlinebank.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    public Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private PrimaryTransactionRepo primaryTransactionRepo;

    @Autowired
    private SavingsTransactionRepo savingsTransactionRepo;

    @Autowired
    private PrimaryAccountRepo primaryAccountRepo;

    @Autowired
    private SavingsAccountRepo savingsAccountRepo;

    @Override
    public List<PrimaryTransaction> findByPrimaryTransactionList(String username) throws CaseStudyException {
        logger.info("findByPrimaryTransactionList Call");
        Users user = usersRepo.findByUserName(username);
        List<PrimaryTransaction> primaryTransactionList = user.getPrimaryAccount().getPrimaryTransactionList();
        logger.debug("primaryTransactionList : {}", primaryTransactionList);
        return primaryTransactionList;
    }

    @Override
    public List<SavingsTransaction> findBySavingsTransactionList(String username) throws CaseStudyException {
        logger.info("findBySavingsTransactionList Call");
        Users user = usersRepo.findByUserName(username);
        List<SavingsTransaction> savingsTransactionList = user.getSavingsAccount().getSavingsTransactionList();
        logger.debug("savingsTransactionList : {}", savingsTransactionList);
        return savingsTransactionList;
    }

    @Override
    public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction) throws CaseStudyException {
        primaryTransactionRepo.save(primaryTransaction);
    }

    @Override
    public void saveSavingDepositTransaction(SavingsTransaction savingsTransaction) throws CaseStudyException {
        savingsTransactionRepo.save(savingsTransaction);
    }

    @Override
    public void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction) throws CaseStudyException {
        primaryTransactionRepo.save(primaryTransaction);
    }

    @Override
    public void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction) throws CaseStudyException {
        savingsTransactionRepo.save(savingsTransaction);
    }

    @Override
    public void betweenAccountsTransfer(String transferFrom, String transferTo, double amount, String userName) throws CaseStudyException {
        Users user = usersRepo.findByUserName(userName);
        PrimaryAccount primaryAccount = user.getPrimaryAccount();
        SavingsAccount savingsAccount = user.getSavingsAccount();

        if (transferFrom.equalsIgnoreCase("Primary") && transferTo.equalsIgnoreCase("Savings")) {
            primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().subtract((new BigDecimal(amount))));
            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().add(new BigDecimal(amount)));

            primaryAccountRepo.save(primaryAccount);
            savingsAccountRepo.save(savingsAccount);

            PrimaryTransaction primaryTransaction = new PrimaryTransaction();
            primaryTransaction.setPrimaryAccount(primaryAccount);
            primaryTransaction.setAmount(amount);
            primaryTransaction.setAvailableBalance(primaryAccount.getAccountBalance());
            primaryTransaction.setDate(new Date());
            primaryTransaction.setDescription("Between account transfer from "+ transferFrom + " to "+ transferTo);
            primaryTransaction.setType(AccountType.Primary2Savings.toString());
            primaryTransaction.setStatus("Finished");
            primaryTransactionRepo.save(primaryTransaction);
        }
        else if (transferFrom.equalsIgnoreCase("Savings") && transferTo.equalsIgnoreCase("Primary")) {
            primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().add(new BigDecimal(amount)));
            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(new BigDecimal(amount)));

            primaryAccountRepo.save(primaryAccount);
            savingsAccountRepo.save(savingsAccount);

            SavingsTransaction savingsTransaction = new SavingsTransaction();
            savingsTransaction.setSavingsAccount(savingsAccount);
            savingsTransaction.setAmount(amount);
            savingsTransaction.setAvailableBalance(savingsAccount.getAccountBalance());
            savingsTransaction.setDate(new Date());
            savingsTransaction.setDescription("Between account transfer from "+ transferFrom + " to "+ transferTo);
            savingsTransaction.setType(AccountType.Savings2Primary.toString());
            savingsTransaction.setStatus("Finished");
            savingsAccountRepo.save(savingsAccount);
        }else{
            throw  new CaseStudyException(ErrorCodes.E_INVALID_BETWEEN_ACCOUNTS_TRANSFER, "");
        }
    }
}
