package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Domain.Entity.User;
import za.ac.cput.Repository.AccountHolderRepository;
import za.ac.cput.Repository.UserRepository;
import za.ac.cput.Service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    public UserRepository repo;

    public UserServiceImpl(UserRepository repo){
        if(!repo.equals(null)) {
            this.repo = repo;
        }
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public Optional<User> read(String username) {
        return repo.findById(username);
    }

    @Override
    public Iterable<User> readAll() {
        return repo.findAll();
    }

    @Override
    public User update(User user) {
        User temp = repo.findById(user.getUsername()).get();
        temp.setUsername(user.getUsername());
        temp.setPassword(user.getPassword());
        return repo.save(temp);
    }
}
