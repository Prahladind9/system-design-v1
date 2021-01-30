package edu.prahlad.facebook.entity.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.prahlad.facebook.entity.actions.Recommendation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="memberId_Seq")
public class Member extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "memberId_Seq")
    private Integer memberId;
    private LocalDate dateOfMembership;
    private String name;

//    private List<Integer> memberFollows;


    @OneToOne(targetEntity = Profile.class)
    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "connectionInvitationId")
    private Set<ConnectionInvitation> connectionInvitations;

}
