package edu.prahlad.facebook.entity.base;

import edu.prahlad.facebook.entity.datatypes.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;

    private Account account;
}