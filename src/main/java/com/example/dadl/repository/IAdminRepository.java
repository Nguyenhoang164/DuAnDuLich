package com.example.dadl.repository;

import com.example.dadl.model.Admin.Admin;
import org.springframework.data.repository.CrudRepository;

public interface IAdminRepository extends CrudRepository<Admin , Integer> {
}
