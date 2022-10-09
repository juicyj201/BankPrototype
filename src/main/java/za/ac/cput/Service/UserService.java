package za.ac.cput.Service;

import za.ac.cput.Domain.Entity.User;

import java.util.Optional;

public interface UserService extends IService<User, String> {
    public User save(User user);
    public Optional<User> read(String username);
    public Iterable<User> readAll();
    public User update(User user);
}
