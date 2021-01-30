package edu.prahlad.facebook.entity.base;

import edu.prahlad.facebook.entity.enums.ConnectionInvitationStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="connectionInvitationId_Seq")
public class ConnectionInvitation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "connectionInvitationId_Seq")
    private Integer connectionInvitationId;
    private ConnectionInvitationStatus status;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;

    @OneToOne(targetEntity = Member.class, cascade = CascadeType.ALL)
    private Member memberInvited;
}
