package za.ac.cput.Service;

import za.ac.cput.Domain.Entity.AccountHolder;

import java.util.List;
import java.util.Optional;

public interface AccountHolderService extends IService<AccountHolder, String>{
    public AccountHolder save(AccountHolder accountHolder);
    public Optional<AccountHolder> read(String accountNumber);
    public AccountHolder readByFirstName(String firstName);
    public Iterable<AccountHolder> readAll();
    public AccountHolder update(AccountHolder accountHolder);
}
