package za.ac.cput.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.Domain.Entity.User;

public interface UserRepository extends CrudRepository<User, String> {
}
