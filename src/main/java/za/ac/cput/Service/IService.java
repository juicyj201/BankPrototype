package za.ac.cput.Service;

import java.util.List;
import java.util.Optional;

public interface IService<T, ID> {
    public T save(T object);
    public Optional<T> read(String ID);
    public Iterable<T> readAll();
}
