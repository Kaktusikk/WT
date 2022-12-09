package by.lab4.repository;

import java.util.List;

import by.lab4.entity.Entity;
import by.lab4.exception.RepositoryException;
import by.lab4.specification.Specification;

public interface Repository<T extends Entity> {

    boolean add(T entity) throws RepositoryException;

    boolean remove(T entity) throws RepositoryException;

    boolean update(T entity) throws RepositoryException;

    List<T> query(Specification specification) throws RepositoryException;

}
