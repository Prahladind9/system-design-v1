package edu.prahlad.facebook.entity.actions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="pageId_Seq")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pageId_Seq")
    private Integer pageId;
    private String name;
    private String description;
    private String type;
    private int totalMembers;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "recommendation_id")
    private List<Recommendation> recommendations;
}
