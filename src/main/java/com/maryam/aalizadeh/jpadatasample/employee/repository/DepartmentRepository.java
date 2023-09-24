package com.maryam.aalizadeh.jpadatasample.employee.repository;

import com.maryam.aalizadeh.jpadatasample.employee.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
