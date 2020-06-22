package edu.prahlad.casestudy.onlinebank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="recipientId_Seq")
public class Recipient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipientId_Seq")
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Users users;
}
