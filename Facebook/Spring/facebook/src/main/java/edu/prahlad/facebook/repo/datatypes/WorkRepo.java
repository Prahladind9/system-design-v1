package edu.prahlad.facebook.repo.datatypes;

import edu.prahlad.facebook.entity.datatypes.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepo extends JpaRepository<Work, Integer> {
}
