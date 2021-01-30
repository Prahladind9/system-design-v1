package edu.prahlad.facebook.repo.datatypes;

import edu.prahlad.facebook.entity.datatypes.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
