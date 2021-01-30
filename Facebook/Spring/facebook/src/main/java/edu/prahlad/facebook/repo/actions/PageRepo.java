package edu.prahlad.facebook.repo.actions;

import edu.prahlad.facebook.entity.actions.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepo extends JpaRepository<Page, Integer> {
}
