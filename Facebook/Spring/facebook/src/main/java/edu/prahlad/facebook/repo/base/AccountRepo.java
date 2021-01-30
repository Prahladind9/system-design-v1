package edu.prahlad.facebook.repo.base;

import edu.prahlad.facebook.entity.base.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {
}
