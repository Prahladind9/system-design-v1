package edu.prahlad.facebook.repo.base;

import edu.prahlad.facebook.entity.base.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Integer> {
}
