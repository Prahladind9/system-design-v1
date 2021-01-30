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
@SequenceGenerator(name = "postId_Seq")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groupId_Seq")
    private Integer postId;
    private String text;
    private int totalLikes;
    private int totalShares;

    //https://dzone.com/articles/introduction-to-spring-data-jpa-part-5-unidirectio
    @OneToOne(targetEntity = Member.class, cascade = CascadeType.ALL)
    private Member member;
}
