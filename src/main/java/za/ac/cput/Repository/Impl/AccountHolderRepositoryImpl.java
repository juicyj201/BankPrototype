package za.ac.cput.Repository.Impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.Domain.Entity.AccountHolder;
import za.ac.cput.Repository.AccountHolderRepository;

import java.util.List;
import java.util.Optional;

public class AccountHolderRepositoryImpl implements AccountHolderRepository {

    @Override
    public <S extends AccountHolder> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AccountHolder> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AccountHolder> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<AccountHolder> findAll() {
        return null;
    }

    @Override
    public Iterable<AccountHolder> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(AccountHolder entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends AccountHolder> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
