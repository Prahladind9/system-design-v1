package edu.prahlad.casestudy.onlinebank.repo;

import edu.prahlad.casestudy.onlinebank.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Long> {
//    Optional<Users> findByUsername(String username);
//    Optional<Users> findByEmail(String email);

    Users findByUserName(String username);
    Users findByEmail(String email);
    List<Users> findAll();
}
