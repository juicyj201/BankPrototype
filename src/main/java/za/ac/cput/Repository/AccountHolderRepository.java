package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import za.ac.cput.Domain.Entity.AccountHolder;

public interface AccountHolderRepository extends CrudRepository<AccountHolder, String> {
}
