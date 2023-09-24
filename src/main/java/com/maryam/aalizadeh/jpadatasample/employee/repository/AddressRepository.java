package com.maryam.aalizadeh.jpadatasample.employee.repository;

import com.maryam.aalizadeh.jpadatasample.employee.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
