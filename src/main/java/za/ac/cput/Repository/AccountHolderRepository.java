package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Entity.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, String> {
}
