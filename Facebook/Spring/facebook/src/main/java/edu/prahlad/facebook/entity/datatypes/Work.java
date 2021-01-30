package edu.prahlad.facebook.entity.datatypes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="workId_Seq")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workId_Seq")
    private Integer workId;

    private String title;
    private String company;
    private String location;
    private LocalDate from;
    private LocalDate to;
    private String description;
}
