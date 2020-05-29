package com.ebs.springbootprojecttemplate.data.repository;

import com.ebs.springbootprojecttemplate.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
