package com.example.dadl.service.impl;

import com.example.dadl.model.Supplier.Supplier;
import com.example.dadl.repository.ISupplierRepository;
import com.example.dadl.service.IGenerateValueService;
import com.example.dadl.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierService implements ISupplierService {
    @Autowired
    private ISupplierRepository supplierRepository;
    @Override
    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    @Override
    public void save(Supplier supplier) {
      supplierRepository.save(supplier);
    }

    @Override
    public void update(Supplier supplier) {
     Optional<Supplier> supplierOptional = supplierRepository.findById(supplier.getId());
     Supplier supplier1 = (Supplier) supplierOptional.get();
     supplier1.setId(supplier.getId());
     supplierRepository.save(supplier1);
    }

    @Override
    public void delete(Supplier supplier) {
          supplierRepository.delete(supplier);
    }
}
