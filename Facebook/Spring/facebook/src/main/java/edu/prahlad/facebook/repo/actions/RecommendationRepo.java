package edu.prahlad.facebook.repo.actions;

import edu.prahlad.facebook.entity.actions.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepo extends JpaRepository<Recommendation, Integer> {
}
