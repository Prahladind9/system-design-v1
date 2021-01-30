package edu.prahlad.facebook.entity.base;

import edu.prahlad.facebook.entity.enums.AccountStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name = "accountId_Seq")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountId_Seq")
    private Long id;
    private String password;
    private AccountStatus status;
    
}
