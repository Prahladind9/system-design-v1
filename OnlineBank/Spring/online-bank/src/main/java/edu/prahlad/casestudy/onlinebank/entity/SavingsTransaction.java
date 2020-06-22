package edu.prahlad.casestudy.onlinebank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="savingsTransactionId_Seq")
public class SavingsTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "savingsTransactionId_Seq")
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "savings_account_id")
    private SavingsAccount savingsAccount;

}
