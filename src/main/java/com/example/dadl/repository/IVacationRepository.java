package com.example.dadl.repository;

import com.example.dadl.model.Services.Vacation.Vacation;
import org.springframework.data.repository.CrudRepository;

public interface IVacationRepository extends CrudRepository<Vacation , Integer> {
}
