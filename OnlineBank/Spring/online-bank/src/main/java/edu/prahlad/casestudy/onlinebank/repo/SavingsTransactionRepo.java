package edu.prahlad.casestudy.onlinebank.repo;

import edu.prahlad.casestudy.onlinebank.entity.SavingsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsTransactionRepo extends JpaRepository<SavingsTransaction, Long> {
}
