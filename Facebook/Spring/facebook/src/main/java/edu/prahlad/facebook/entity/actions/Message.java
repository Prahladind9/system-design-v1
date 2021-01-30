package edu.prahlad.facebook.entity.actions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.prahlad.facebook.entity.base.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name = "messageId_Seq")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageId_Seq")
    private Integer messageId;
    private String messageBody;
    private byte[] media;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "memberId")
    private List<Member> sentTo;

    //public boolean addMember(Member member)
}
