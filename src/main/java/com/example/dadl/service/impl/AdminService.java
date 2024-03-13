package com.example.dadl.service.impl;

import com.example.dadl.model.Admin.Admin;
import com.example.dadl.repository.IAdminRepository;
import com.example.dadl.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private IAdminRepository adminRepository;
    @Override
    public Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Optional<Admin> findById(int id) {
        return adminRepository.findById(id);
    }

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void update(Admin admin) {
         adminRepository.delete(admin);
         adminRepository.save(admin);
    }

    @Override
    public void delete(Admin admin) {
        adminRepository.delete(admin);
    }
}
