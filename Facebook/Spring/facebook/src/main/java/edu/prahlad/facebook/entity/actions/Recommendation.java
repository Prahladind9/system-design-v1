package edu.prahlad.facebook.entity.actions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="recommendationId_Seq")
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recommendationId_Seq")
    private Integer recommendationId;
    private int rating;
    private String description;
    private LocalDate createdAt;

}
