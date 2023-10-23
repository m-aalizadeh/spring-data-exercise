package com.maryam.aalizadeh.jpadatasample.employee.repository;

import com.maryam.aalizadeh.jpadatasample.employee.model.EmbeddedEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbeddedEmployeeRepository extends CrudRepository<EmbeddedEmployee,Long> {
}
