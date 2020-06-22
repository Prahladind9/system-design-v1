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
@SequenceGenerator(name ="primaryAccountId_Seq")
public class PrimaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "primaryAccountId_Seq")
    private Long primaryAccountId;
    private int accountNumber;
    private BigDecimal accountBalance;

    @OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<PrimaryTransaction> primaryTransactionList;
}
