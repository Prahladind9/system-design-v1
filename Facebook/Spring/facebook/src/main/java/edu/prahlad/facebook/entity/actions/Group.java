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
@SequenceGenerator(name = "groupId_Seq")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groupId_Seq")
    private Integer groupId;
    private String name;
    private String description;
    private int totalMembers;

//    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    > for bidirectional relationship
    //https://thorben-janssen.com/best-practices-many-one-one-many-associations-mappings/
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "member_id")
    private List<Member> members;
}
