package edu.prahlad.casestudy.onlinebank.repo;

import edu.prahlad.casestudy.onlinebank.entity.PrimaryTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryTransactionRepo extends JpaRepository<PrimaryTransaction, Long> {
}
