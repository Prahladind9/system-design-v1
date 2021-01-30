package edu.prahlad.facebook.repo.actions;

import edu.prahlad.facebook.entity.actions.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Integer> {
}
