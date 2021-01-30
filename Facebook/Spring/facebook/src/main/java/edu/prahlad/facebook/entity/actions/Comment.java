package edu.prahlad.facebook.entity.actions;

import edu.prahlad.facebook.entity.base.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name = "commentId_Seq")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commentId_Seq")
    private Integer commentId;
    private String text;
    private int totalLikes;

    //https://dzone.com/articles/introduction-to-spring-data-jpa-part-5-unidirectio
    @OneToOne(targetEntity = Member.class, cascade = CascadeType.ALL)
    private Member owner;


}
