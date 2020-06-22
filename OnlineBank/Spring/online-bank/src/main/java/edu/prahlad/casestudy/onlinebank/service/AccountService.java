package edu.prahlad.casestudy.onlinebank.service;

import edu.prahlad.casestudy.onlinebank.constants.AccountType;
import edu.prahlad.casestudy.onlinebank.entity.PrimaryAccount;
import edu.prahlad.casestudy.onlinebank.entity.SavingsAccount;
import edu.prahlad.casestudy.onlinebank.model.AccountUserModel;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();

    AccountUserModel deposit(AccountUserModel accountUserModel) throws CaseStudyException;
    AccountUserModel withdraw(AccountUserModel accountUserModel)throws CaseStudyException;

}
