package edu.prahlad.facebook.repo.actions;

import edu.prahlad.facebook.entity.actions.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
