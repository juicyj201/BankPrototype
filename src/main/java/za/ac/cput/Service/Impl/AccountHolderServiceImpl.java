package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Repository.AccountHolderRepository;
import za.ac.cput.Repository.Impl.AccountHolderRepositoryImpl;
import za.ac.cput.Service.AccountHolderService;

import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {
    public AccountHolderRepositoryImpl repo;

    public AccountHolderServiceImpl(AccountHolderRepositoryImpl repo){
        if(!repo.equals(null)) {
            this.repo = repo;
        }
    }

    @Override
    public AccountHolder save(AccountHolder accountHolder) {
        return repo.save(accountHolder);
    }

    @Override
    public Optional<AccountHolder> read(String accountNumber) {
        return repo.findById(accountNumber);
    }

    @Override
    public Iterable<AccountHolder> readAll() {
        return repo.findAll();
    }
}
