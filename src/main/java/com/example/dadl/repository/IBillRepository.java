package com.example.dadl.repository;

import com.example.dadl.model.Services.Bill.Bill;
import org.springframework.data.repository.CrudRepository;

public interface IBillRepository extends CrudRepository<Bill ,Integer> {
}
