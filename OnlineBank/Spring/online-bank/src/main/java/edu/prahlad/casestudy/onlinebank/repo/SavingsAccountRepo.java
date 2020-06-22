package edu.prahlad.casestudy.onlinebank.repo;

import edu.prahlad.casestudy.onlinebank.entity.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepo extends JpaRepository<SavingsAccount, Long> {
    SavingsAccount findByAccountNumber(int accountNumber);
}
