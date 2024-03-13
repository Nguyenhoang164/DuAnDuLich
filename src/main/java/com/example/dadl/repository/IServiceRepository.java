package com.example.dadl.repository;

import com.example.dadl.model.Services.Service.Service;
import org.springframework.data.repository.CrudRepository;

public interface IServiceRepository extends CrudRepository<Service , Integer> {
}
