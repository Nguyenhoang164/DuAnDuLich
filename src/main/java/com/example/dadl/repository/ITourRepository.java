package com.example.dadl.repository;

import com.example.dadl.model.Services.Tour.Tour;
import org.springframework.data.repository.CrudRepository;

public interface ITourRepository extends CrudRepository<Tour , Integer> {
}
