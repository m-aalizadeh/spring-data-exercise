package com.maryam.aalizadeh.jpadatasample.employee.repository;

import com.maryam.aalizadeh.jpadatasample.employee.dto.EmployeeDepartment;
import com.maryam.aalizadeh.jpadatasample.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT NEW com.maryam.aalizadeh.jpadatasample.employee.dto.EmployeeDepartment(e.firstName, e.lastName, e.salary, d.name) from Employee e, Department d where e.department.id=d.id and e.department.id=?1 and d.id=?1")
    List<EmployeeDepartment> getEmployeeByDepartment(Long id);
    @Query("SELECT e from Employee e where e.salary > ?1")
    List<Employee> getEmployeeGreaterSalary(Double salary);

}
