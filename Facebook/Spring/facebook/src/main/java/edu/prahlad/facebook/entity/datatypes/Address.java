package edu.prahlad.facebook.entity.datatypes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="addressId_Seq")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressId_Seq")
    private Integer addressId;

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
