package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Repository.AccountHolderRepository;
import za.ac.cput.Service.AccountHolderService;

import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {
    public AccountHolderRepository repo;

    public AccountHolderServiceImpl(AccountHolderRepository repo){
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
    public AccountHolder readByFirstName(String firstName) {
        List<AccountHolder> list = (List<AccountHolder>) repo.findAll();
        if(list.stream().findFirst().get().getFirstName().equals(firstName)){
            return list.stream().findFirst().get();
        }

        return null;
    }


    @Override
    public Iterable<AccountHolder> readAll() {
        return repo.findAll();
    }

    @Override
    public AccountHolder update(AccountHolder accountHolder) {
        AccountHolder temp = repo.findById(accountHolder.getAccountNumber()).get();
        temp.setAccountNumber(accountHolder.getAccountNumber());
        temp.setFirstName(accountHolder.getFirstName());
        temp.setLastName(accountHolder.getLastName());
        temp.setAddress(accountHolder.getAddress());
        temp.setEmail(accountHolder.getEmail());
        temp.setBalance(accountHolder.getBalance());
        return repo.save(temp);
    }
}
