package com.example.dadl.repository;

import com.example.dadl.model.Services.Room.Room;
import org.springframework.data.repository.CrudRepository;

public interface IRoomRepository extends CrudRepository<Room , Integer> {
}
