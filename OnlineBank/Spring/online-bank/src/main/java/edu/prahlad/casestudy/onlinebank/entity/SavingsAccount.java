package edu.prahlad.casestudy.onlinebank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="savingsAccountId_Seq")
public class SavingsAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "savingsAccountId_Seq")
    private Long savingsAccountId;
    private int accountNumber;
    private BigDecimal accountBalance;

    @OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SavingsTransaction> savingsTransactionList;
}
