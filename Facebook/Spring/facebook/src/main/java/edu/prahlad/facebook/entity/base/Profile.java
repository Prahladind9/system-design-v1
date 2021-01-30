package edu.prahlad.facebook.entity.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.prahlad.facebook.entity.datatypes.Work;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name = "profileId_Seq")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profileId_Seq")
    private Integer profileId;
    private byte[] profilePicture;
    private byte[] coverPhoto;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "workId")
    private List<Work> workExperiences;
//    private List<Education> educations;
//    private List<Place> places;
//    private List<Stat> stats;
}
