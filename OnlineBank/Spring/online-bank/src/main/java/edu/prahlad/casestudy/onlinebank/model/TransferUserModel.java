package edu.prahlad.casestudy.onlinebank.model;
import edu.prahlad.casestudy.onlinebank.constants.AccountType;
import edu.prahlad.casestudy.onlinebank.entity.Users;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class TransferUserModel extends Users{

    private String transferFrom;
    private String transferTo;
    private double transactionAmount;


}
