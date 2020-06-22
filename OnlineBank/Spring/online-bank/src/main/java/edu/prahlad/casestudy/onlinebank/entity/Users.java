package edu.prahlad.casestudy.onlinebank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
//@ToString
@SequenceGenerator(name ="userId_Seq")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userId_Seq")
    @Column(name = "userId", nullable = false, updatable = false)
    private Long userId;
    private String userName;

    private String password;
    private String firstName;
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    private String phone;
    private boolean enabled= true;

    @OneToOne
    private PrimaryAccount primaryAccount;
    @OneToOne
    private SavingsAccount savingsAccount;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Appointment> appointmentList;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Recipient> recipientList;


}
