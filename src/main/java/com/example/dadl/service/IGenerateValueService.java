package com.example.dadl.service;

import java.util.Optional;

public interface IGenerateValueService<T> {
    Iterable<T> findAll();
    Optional<T> findById(int id);
    void save(T t);
    void update(T t);
    void delete(T t);

}
