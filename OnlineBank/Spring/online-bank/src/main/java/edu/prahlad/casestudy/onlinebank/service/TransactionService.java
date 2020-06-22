package edu.prahlad.casestudy.onlinebank.service;

import edu.prahlad.casestudy.onlinebank.entity.*;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;

import java.util.List;

public interface TransactionService {
    List<PrimaryTransaction> findByPrimaryTransactionList(String username) throws CaseStudyException;
    List<SavingsTransaction> findBySavingsTransactionList(String username) throws CaseStudyException;

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction) throws CaseStudyException;
    void saveSavingDepositTransaction(SavingsTransaction savingsTransaction) throws CaseStudyException;

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction) throws CaseStudyException;
    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction) throws CaseStudyException;


    void betweenAccountsTransfer
            (String transferFrom, String transferTo, double amount, String userName)
                    throws CaseStudyException;
}
