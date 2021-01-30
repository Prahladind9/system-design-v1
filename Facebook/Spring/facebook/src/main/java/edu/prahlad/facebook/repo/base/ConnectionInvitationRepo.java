package edu.prahlad.facebook.repo.base;

import edu.prahlad.facebook.entity.base.ConnectionInvitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionInvitationRepo extends JpaRepository<ConnectionInvitation, Integer> {
}
