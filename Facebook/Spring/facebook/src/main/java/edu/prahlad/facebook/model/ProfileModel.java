package edu.prahlad.facebook.model;

import edu.prahlad.facebook.entity.datatypes.Work;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ProfileModel {
    private Integer profileId;
    private List<Work> workExperiences;
}
