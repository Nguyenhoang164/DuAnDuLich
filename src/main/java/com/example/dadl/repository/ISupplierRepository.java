package com.example.dadl.repository;

import com.example.dadl.model.Supplier.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface ISupplierRepository extends CrudRepository<Supplier , Integer> {
}
