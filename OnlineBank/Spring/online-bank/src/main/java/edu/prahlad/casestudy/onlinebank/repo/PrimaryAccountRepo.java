package edu.prahlad.casestudy.onlinebank.repo;

import edu.prahlad.casestudy.onlinebank.entity.PrimaryAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryAccountRepo extends JpaRepository<PrimaryAccount, Long> {
    PrimaryAccount findByAccountNumber(int accountNumber);
}
