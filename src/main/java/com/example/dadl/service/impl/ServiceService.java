package com.example.dadl.service.impl;

import com.example.dadl.repository.IServiceRepository;
import com.example.dadl.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    private IServiceRepository serviceRepository;
    @Override
    public Iterable<com.example.dadl.model.Services.Service.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<com.example.dadl.model.Services.Service.Service> findById(int id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void save(com.example.dadl.model.Services.Service.Service service) {
      serviceRepository.save(service);
    }

    @Override
    public void update(com.example.dadl.model.Services.Service.Service service) {
        Optional<com.example.dadl.model.Services.Service.Service> serviceOptional = serviceRepository.findById(service.getId());
        com.example.dadl.model.Services.Service.Service service1 = (com.example.dadl.model.Services.Service.Service) serviceOptional.get();
        service1.setId(service.getId());
        serviceRepository.save(service1);
    }

    @Override
    public void delete(com.example.dadl.model.Services.Service.Service service) {
       serviceRepository.delete(service);
    }
}
