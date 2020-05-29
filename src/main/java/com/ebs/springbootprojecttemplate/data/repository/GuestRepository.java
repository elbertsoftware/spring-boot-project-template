package com.ebs.springbootprojecttemplate.data.repository;

import com.ebs.springbootprojecttemplate.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
