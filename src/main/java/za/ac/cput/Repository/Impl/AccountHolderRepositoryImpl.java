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
    public List<AccountHolder> findAll() {
        return null;
    }

    @Override
    public List<AccountHolder> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AccountHolder> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AccountHolder> findAllById(Iterable<String> strings) {
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

    @Override
    public <S extends AccountHolder> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AccountHolder> List<S> saveAll(Iterable<S> entities) {
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
    public void flush() {

    }

    @Override
    public <S extends AccountHolder> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends AccountHolder> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AccountHolder> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AccountHolder getOne(String s) {
        return null;
    }

    @Override
    public AccountHolder getById(String s) {
        return null;
    }

    @Override
    public AccountHolder getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends AccountHolder> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AccountHolder> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AccountHolder> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AccountHolder> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AccountHolder> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AccountHolder> boolean exists(Example<S> example) {
        return false;
    }
}
