package edu.prahlad.facebook.repo.actions;

import edu.prahlad.facebook.entity.actions.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, Integer> {
}
